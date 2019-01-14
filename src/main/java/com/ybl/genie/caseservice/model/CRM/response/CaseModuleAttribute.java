package com.ybl.genie.caseservice.model.CRM.response;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CaseModuleAttribute {

    private String caseType;

    private List<CaseTypeAttribute> caseTypeAttribute;

    public CaseModuleAttribute() {
    }

    public CaseModuleAttribute(String caseType, List<CaseTypeAttribute> caseTypeAttribute) {
        this.caseType = caseType;
        this.caseTypeAttribute = caseTypeAttribute;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public List<CaseTypeAttribute> getCaseTypeAttribute() {
        return caseTypeAttribute;
    }

    public void setCaseTypeAttribute(List<CaseTypeAttribute> caseTypeAttribute) {
        this.caseTypeAttribute = caseTypeAttribute;
    }
}
