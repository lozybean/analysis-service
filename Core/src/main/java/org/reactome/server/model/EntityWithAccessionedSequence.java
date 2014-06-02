package org.reactome.server.model;

// Generated Jul 8, 2011 1:48:55 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * EntityWithAccessionedSequence generated by hbm2java
 */
@XmlRootElement
public class EntityWithAccessionedSequence extends GenomeEncodedEntity {

    private Integer endCoordinate;
    private ReferenceSequence referenceEntity;
    private Integer startCoordinate;
    private List<AbstractModifiedResidue> hasModifiedResidue;
    
    public EntityWithAccessionedSequence() {
    }

    public List<AbstractModifiedResidue> getHasModifiedResidue() {
        return hasModifiedResidue;
    }

    public void setHasModifiedResidue(List<AbstractModifiedResidue> hasModifiedResidue) {
        this.hasModifiedResidue = hasModifiedResidue;
    }

    public Integer getEndCoordinate() {
        return this.endCoordinate;
    }

    public void setEndCoordinate(Integer endCoordinate) {
        this.endCoordinate = endCoordinate;
    }

    public ReferenceSequence getReferenceEntity() {
        return this.referenceEntity;
    }

    public void setReferenceEntity(ReferenceSequence referenceEntity) {
        this.referenceEntity = referenceEntity;
    }

    public Integer getStartCoordinate() {
        return this.startCoordinate;
    }

    public void setStartCoordinate(Integer startCoordinate) {
        this.startCoordinate = startCoordinate;
    }

}
