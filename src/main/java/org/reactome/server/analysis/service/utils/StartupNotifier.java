package org.reactome.server.analysis.service.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Guilherme S Viteri <gviteri@ebi.ac.uk>
 */

@Component
public class StartupNotifier extends Thread {

    private static Logger logger = LoggerFactory.getLogger("threadLogger");

    private static final String PROJECT = "AnalysisService";
    private static final String FROM = "noreply@reactome.org";
    private static final String SENDER_NAME = "Tomcat";

    private final MailService sms;
    private final String to;

    @Autowired
    public StartupNotifier(MailService sms, @Value("${mail.to}") String to) {
        super("AS-StartupNotifier");
        this.sms = sms;
        this.to = to;
        start();
    }

    @Override
    public void run() {
        try {
            logger.debug("Getting ready to send an email....");

            final String serverName = InetAddress.getLocalHost().getHostName();
            final String subject = "[" + serverName + "] " + PROJECT + " deployed " + getTimestamp();
            final String body = PROJECT + " has been (re)deployed in [" + serverName + "]";

            sms.send(SENDER_NAME, FROM, to, subject, body);

            logger.debug("Sent!");
        } catch (Exception e) {
            logger.warn("Startup notification failed because: " + e.getMessage().split("\n")[0]);
        }
    }

    private String getTimestamp() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }
}
