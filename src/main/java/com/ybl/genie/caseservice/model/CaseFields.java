package com.ybl.genie.caseservice.model;

import javax.persistence.Embeddable;

@Embeddable
public class CaseFields {

    private String entityName;
    private String entityDisplayName;
    private String attributeDisplayName;
    private String attributeName;
    private String type;

    public CaseFields(String entityName, String entityDisplayNmae, String attributeDisplayName, String attributeName, String type) {
        this.entityName = entityName;
        this.entityDisplayName = entityDisplayNmae;
        this.attributeDisplayName = attributeDisplayName;
        this.attributeName = attributeName;
        this.type = type;
    }

    public String getEntityName() {
        return entityName;
    }

    public String getEntityDisplayName() {
        return entityDisplayName;
    }

    public String getAttributeDisplayName() {
        return attributeDisplayName;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public String getType() {
        return type;
    }
}
