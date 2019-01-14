package com.ybl.genie.caseservice.resource;

import com.ybl.genie.caseservice.model.CRM.ServiceModule;
import com.ybl.genie.caseservice.model.CRM.response.CaseModuleResponse;
import com.ybl.genie.caseservice.service.AdditionalConfigService;
import com.ybl.genie.caseservice.service.CaseModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/case/config")
public class CaseConfigResource {

    @Autowired
    private CaseModuleService caseModuleService;

    @Autowired
    private AdditionalConfigService additionalConfigService;

    @GetMapping("/modules/{productName}")
    public CaseModuleResponse getModules(@PathVariable String productName){
        return caseModuleService.getModulesByProductName(productName);
    }

    @GetMapping("/module/{issueTypeId}")
    public ServiceModule getModule(@PathVariable long issueTypeId){
        return caseModuleService.getModuleByIssueTypeId(issueTypeId);
    }

    @GetMapping("/products")
    public List<String> getProductList(){
        return caseModuleService.getProductList();
    }

    @GetMapping("/additionalfields/{issueTypeId}")
    public List<Object> getAdditionalFields(@PathVariable long issueTypeId){
        return additionalConfigService.getAdditionalFields(issueTypeId);
    }

}
