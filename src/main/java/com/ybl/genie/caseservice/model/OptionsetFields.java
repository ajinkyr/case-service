package com.ybl.genie.caseservice.model;

import javax.persistence.Embeddable;

@Embeddable
public class OptionsetFields {

    private String attributeName;
    private String attributeIndex;
    private String attributeValue;

    public OptionsetFields(String attributeName, String attributeIndex, String attributeValue) {
        this.attributeName = attributeName;
        this.attributeIndex = attributeIndex;
        this.attributeValue = attributeValue;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public String getAttributeIndex() {
        return attributeIndex;
    }

    public String getAttributeValue() {
        return attributeValue;
    }
}
