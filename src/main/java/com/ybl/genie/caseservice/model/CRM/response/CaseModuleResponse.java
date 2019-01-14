package com.ybl.genie.caseservice.model.CRM.response;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CaseModuleResponse {

    private String productName;

    private List<CaseModuleAttribute> caseModuleAttributes;

    public CaseModuleResponse() {
    }

    public CaseModuleResponse(String productName, List<CaseModuleAttribute> caseModuleAttributes) {
        this.productName = productName;
        this.caseModuleAttributes = caseModuleAttributes;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<CaseModuleAttribute> getCaseModuleAttributes() {
        return caseModuleAttributes;
    }

    public void setCaseModuleAttributes(List<CaseModuleAttribute> caseModuleAttributes) {
        this.caseModuleAttributes = caseModuleAttributes;
    }

    @Override
    public String toString() {
        return "CaseModuleResponse{" +
                "productName='" + productName + '\'' +
                ", caseModuleAttributes=" + caseModuleAttributes +
                '}';
    }
}
