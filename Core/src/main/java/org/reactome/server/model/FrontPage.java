package org.reactome.server.model;

// Generated Jul 8, 2011 1:48:55 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * FrontPage generated by hbm2java
 */
@XmlRootElement
public class FrontPage extends DatabaseObject {

    private List<Event> frontPageItem;

    public List<Event> getFrontPageItem() {
        return frontPageItem;
    }

    public void setFrontPageItem(List<Event> frontPageItem) {
        this.frontPageItem = frontPageItem;
    }

    public FrontPage() {
    }

}
