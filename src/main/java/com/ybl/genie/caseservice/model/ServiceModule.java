package com.ybl.genie.caseservice.model;

import com.ybl.genie.caseservice.constant.CaseCategory;

import javax.persistence.*;

@Entity
@Table(name = "servicemodule")
public class ServiceModule {

    @Id
    @Column(name="issuetypeid")
    private long issueTypeId;

    @Column(name="productname")
    private String productName;

    @Column(name="casetype")
    private String caseType;

    @Column(name="issuetypename")
    private String issueTypeName;

    @Enumerated(EnumType.STRING)
    @Column(name="casecategory")
    private CaseCategory caseCategory;

    @Column(name="casecategoryid")
    private long caseCategoryId;

    public ServiceModule() {
    }

    public ServiceModule(long issueTypeId, String productName,
                         String caseType, String issueTypeName, CaseCategory caseCategory, long caseCategoryId) {
        this.issueTypeId = issueTypeId;
        this.productName = productName;
        this.caseType = caseType;
        this.issueTypeName = issueTypeName;
        this.caseCategory = caseCategory;
        this.caseCategoryId=caseCategoryId;
    }

    public long getIssueTypeId() {
        return issueTypeId;
    }

    public void setIssueTypeId(long issueTypeId) {
        this.issueTypeId = issueTypeId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getIssueTypeName() {
        return issueTypeName;
    }

    public void setIssueTypeName(String issueTypeName) {
        this.issueTypeName = issueTypeName;
    }

    public CaseCategory getCaseCategory() {
        return caseCategory;
    }

    public void setCaseCategory(CaseCategory caseCategory) {
        this.caseCategory = caseCategory;
    }

    public long getCaseCategoryId() {
        return caseCategoryId;
    }

    public void setCaseCategoryId(long caseCategoryId) {
        this.caseCategoryId = caseCategoryId;
    }
}
