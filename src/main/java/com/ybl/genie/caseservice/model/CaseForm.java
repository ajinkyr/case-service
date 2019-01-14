package com.ybl.genie.caseservice.model;

import com.ybl.genie.caseservice.model.CRM.ServiceModule;

public class CaseForm extends ServiceModule {

    private String mdmId;
    private String referenceNo;
    private String custId;
    private String remarks;

    public CaseForm(long issueTypeId, String productName, String caseType,
                    String issueTypeName, String caseCategory,
                    long caseCategoryId, String mdmId,
                    String referenceNo, String custId, String remarks) {
        super(issueTypeId, productName, caseType, issueTypeName, caseCategory, caseCategoryId);
        this.mdmId = mdmId;
        this.referenceNo = referenceNo;
        this.custId = custId;
        this.remarks = remarks;
    }

    public String getMdmId() {
        return mdmId;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public String getCustId() {
        return custId;
    }

    public String getRemarks() {
        return remarks;
    }


}
