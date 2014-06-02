package org.reactome.server.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

// Generated Jul 8, 2011 1:48:55 PM by Hibernate Tools 3.4.0.CR1

/**
 * ReferenceIsoform generated by hbm2java
 */
@XmlRootElement
public class ReferenceIsoform extends ReferenceGeneProduct {

    private String variantIdentifier;
    private List<ReferenceGeneProduct> isoformParent;

    public ReferenceIsoform() {
    }

    public String getVariantIdentifier() {
        return this.variantIdentifier;
    }

    public void setVariantIdentifier(String variantIdentifier) {
        this.variantIdentifier = variantIdentifier;
    }

    public List<ReferenceGeneProduct> getIsoformParent() {
        return isoformParent;
    }

    public void setIsoformParent(List<ReferenceGeneProduct> isoformParent) {
        this.isoformParent = isoformParent;
    }

}
