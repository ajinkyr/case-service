package com.ybl.genie.caseservice.model.CRM.response;


import org.springframework.stereotype.Component;

@Component
public class CaseTypeAttribute {

    private String issueTypeName;
    private String caseCategory;
    private long issueTypeId;

    public CaseTypeAttribute() {
    }

    public CaseTypeAttribute(String issueTypeName, String caseCategory, long issueTypeId) {
        this.issueTypeName = issueTypeName;
        this.caseCategory = caseCategory;
        this.issueTypeId = issueTypeId;
    }

    public String getIssueTypeName() {
        return issueTypeName;
    }

    public void setIssueTypeName(String issueTypeName) {
        this.issueTypeName = issueTypeName;
    }

    public String getCaseCategory() {
        return caseCategory;
    }

    public void setCaseCategory(String caseCategory) {
        this.caseCategory = caseCategory;
    }

    public long getIssueTypeId() {
        return issueTypeId;
    }

    public void setIssueTypeId(long issueTypeId) {
        this.issueTypeId = issueTypeId;
    }

    @Override
    public String toString() {
        return "CaseTypeAttribute{" +
                "issueTypeName='" + issueTypeName + '\'' +
                ", caseCategory='" + caseCategory + '\'' +
                ", issueTypeId=" + issueTypeId +
                '}';
    }
}
