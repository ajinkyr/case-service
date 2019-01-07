package com.ybl.genie.caseservice.service;

import com.ybl.genie.caseservice.model.ServiceModule;

import java.util.List;

public interface CaseModuleService {

    List<ServiceModule> getServiceModulesByProductName(String productName);

   }
