package org.reactome.server.model;

// Generated Jul 8, 2011 1:48:55 PM by Hibernate Tools 3.4.0.CR1

import javax.xml.bind.annotation.XmlRootElement;

/**
 * OpenSet generated by hbm2java
 */
@XmlRootElement
public class OpenSet extends EntitySet {
    private ReferenceEntity referenceEntity;

    public OpenSet() {
    }

    public ReferenceEntity getReferenceEntity() {
        return referenceEntity;
    }

    public void setReferenceEntity(ReferenceEntity referenceEntity) {
        this.referenceEntity = referenceEntity;
    }

}
