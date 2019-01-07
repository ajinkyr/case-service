package com.ybl.genie.caseservice.resource;

import com.ybl.genie.caseservice.model.ServiceModule;
import com.ybl.genie.caseservice.service.CaseModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/case/config")
public class CaseConfigResource {

    @Autowired
    private CaseModuleService caseModuleService;

    @GetMapping
    public List<ServiceModule> getProductList(@RequestParam String productName){
        return caseModuleService.getServiceModulesByProductName(productName);
    }




}
