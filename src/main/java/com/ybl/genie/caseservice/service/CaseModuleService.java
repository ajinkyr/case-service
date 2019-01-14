package com.ybl.genie.caseservice.service;

import com.ybl.genie.caseservice.model.CRM.ServiceModule;
import com.ybl.genie.caseservice.model.CRM.response.CaseModuleResponse;

import java.util.List;

public interface CaseModuleService {

    CaseModuleResponse getModulesByProductName(String productName);

    ServiceModule getModuleByIssueTypeId(long issueTypeId);

    List<String> getProductList();

   }
