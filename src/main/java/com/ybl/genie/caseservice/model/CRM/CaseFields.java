package com.ybl.genie.caseservice.model.CRM;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="case_field_master")
public class CaseFields {

    private String entityName;
    private String entityDisplayName;
    private String attributeDisplayName;
    private String attributeName;
    private String attributeType;

    public CaseFields(String entityName, String entityDisplayNmae, String attributeDisplayName, String attributeName, String type) {
        this.entityName = entityName;
        this.entityDisplayName = entityDisplayNmae;
        this.attributeDisplayName = attributeDisplayName;
        this.attributeName = attributeName;
        this.attributeType = type;
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

    public String getAttributeType() {
        return attributeType;
    }
}
