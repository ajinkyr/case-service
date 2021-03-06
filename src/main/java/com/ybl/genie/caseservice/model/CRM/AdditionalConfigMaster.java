package com.ybl.genie.caseservice.model.CRM;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="additional_config_master")
public class AdditionalConfigMaster {

   private long issueTypeId;
   private String issueTypeName;
   private String fieldName;
   private int isFieldReq;

    public AdditionalConfigMaster(long issueTypeId, String issueTypeName, String fieldName, int isFieldReq) {
        this.issueTypeId = issueTypeId;
        this.issueTypeName = issueTypeName;
        this.fieldName = fieldName;
        this.isFieldReq = isFieldReq;
    }

    public long getIssueTypeId() {
        return issueTypeId;
    }

    public String getIssueTypeName() {
        return issueTypeName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public int getIsFieldReq() {
        return isFieldReq;
    }
}
