package com.ybl.genie.caseservice.model.CRM.response;

import com.ybl.genie.caseservice.model.CRM.AdditionalConfigMaster;

import java.util.List;

public class AdditionalConfigResponse {

    private long issueTypeId;

    private List<AdditionalConfigMaster> additionalFields;

    public AdditionalConfigResponse(long issueTypeId, List<AdditionalConfigMaster> additionalFields) {
        this.issueTypeId = issueTypeId;
        this.additionalFields = additionalFields;
    }

    public long getIssueTypeId() {
        return issueTypeId;
    }

    public void setIssueTypeId(long issueTypeId) {
        this.issueTypeId = issueTypeId;
    }

    public List<AdditionalConfigMaster> getAdditionalFields() {
        return additionalFields;
    }

    public void setAdditionalFields(List<AdditionalConfigMaster> additionalFields) {
        this.additionalFields = additionalFields;
    }
}
