package com.ybl.genie.caseservice.constant;

public enum CaseCategory {

    COMPLAINT("Compliant"),
    REQUEST("Request"),
    QUERY("Query"),
    FEEDBACK("Feedback");

    private String caseCategory;

    CaseCategory(String caseCategory) {
        this.caseCategory=caseCategory;
    }

    public String getCaseCategory() {
        return caseCategory;
    }
}
