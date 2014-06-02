/*
 * Created on Jul 27, 2012
 *
 */
package org.reactome.server.mapper;

import org.gk.model.GKInstance;
import org.gk.model.PersistenceAdaptor;
import org.reactome.server.controller.ReactomeModelPostMapper;
import org.reactome.server.controller.ReactomeToRESTfulAPIConverter;
import org.reactome.server.model.DatabaseIdentifier;
import org.reactome.server.model.DatabaseObject;

/**
 * @author gwu
 *
 */
public class DatabaseIdentifierMapper extends ReactomeModelPostMapper {
    
    public DatabaseIdentifierMapper() {
        
    }

    @Override
    public void postProcess(GKInstance inst, 
                            DatabaseObject obj,
                            ReactomeToRESTfulAPIConverter converter) throws Exception {
        setURL(inst, obj);
    }

    @Override
    public void fillDetailedView(GKInstance inst, DatabaseObject obj,
                                 ReactomeToRESTfulAPIConverter converter) throws Exception {
    }

    @Override
    public void postShellProcess(GKInstance inst, DatabaseObject obj) throws Exception {
        // Want to provide ReferenceDatabase and converted URL.
        setURL(inst, obj);
    }
    
    private void setURL(GKInstance inst,
                        DatabaseObject obj) throws Exception {
        if (!(obj instanceof DatabaseIdentifier))
            return;
        DatabaseIdentifier dbi = (DatabaseIdentifier) obj;
        PersistenceAdaptor dba = inst.getDbAdaptor();
        assignValidURLToDatabaseIdentifier(dba, dbi);
    }

    @Override
    protected boolean isValidObject(DatabaseObject obj) {
        return obj instanceof DatabaseIdentifier;
    }
    
    
    
}
