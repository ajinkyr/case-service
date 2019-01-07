package com.ybl.genie.caseservice.repository;

import com.ybl.genie.caseservice.model.ServiceModule;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ServiceModuleRepository {

    List<String> getProductList();

    //Required for recommandation service
    ServiceModule getServiceModule(long issueTypeId);

    //Required for transaction
    @Query("SELECT * FROM servicemodule sm where sm.productname=:productName")
    List<ServiceModule> getByProductName(String productName);


}
