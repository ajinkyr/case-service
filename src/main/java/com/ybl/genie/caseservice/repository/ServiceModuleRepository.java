package com.ybl.genie.caseservice.repository;

import com.ybl.genie.caseservice.model.CRM.ServiceModule;

import java.util.List;

public interface ServiceModuleRepository {

    List<String> getProductList();

    //Required for recommandation service
    ServiceModule getCaseModule(long issueTypeId);

    //Required for transaction
    List<ServiceModule> getCaseModules(String productName);


}
