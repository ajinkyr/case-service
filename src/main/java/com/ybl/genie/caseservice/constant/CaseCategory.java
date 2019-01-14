package com.ybl.genie.caseservice.constant;

public enum CaseCategory {

    COMPLAINT("Complaint"),
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
