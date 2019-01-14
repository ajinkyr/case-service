package com.ybl.genie.caseservice.service.impl;

import com.ybl.genie.caseservice.model.CRM.ServiceModule;
import com.ybl.genie.caseservice.model.CRM.response.CaseModuleAttribute;
import com.ybl.genie.caseservice.model.CRM.response.CaseModuleResponse;
import com.ybl.genie.caseservice.model.CRM.response.CaseTypeAttribute;
import com.ybl.genie.caseservice.repository.ServiceModuleRepository;
import com.ybl.genie.caseservice.repository.impl.ServiceModuleRepoImpl;
import com.ybl.genie.caseservice.service.CaseModuleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CaseModuleServiceImpl implements CaseModuleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CaseModuleServiceImpl.class);

    @Autowired
    private ServiceModuleRepository serviceModuleRepository;

    @Autowired
    private CaseModuleResponse caseModuleResponse;

    @Override
    public CaseModuleResponse getModulesByProductName(String productName) {
        if (!productName.isEmpty()) {
            LOGGER.info("Getting module attributed for product : {}",productName);
            caseModuleResponse.setProductName(productName);
            List<ServiceModule> serviceModules = serviceModuleRepository.getCaseModules(productName);

            Set<String> caseTypes = serviceModules.stream().map(ServiceModule::getCaseType)
                    .collect(Collectors.toSet());
            LOGGER.info("Uniquely identified products/services : {}",caseTypes.toString());
            List<CaseModuleAttribute> caseModuleAttributeList = new ArrayList<>();
            for (String types : caseTypes) {
                List<CaseTypeAttribute> caseTypeAttributes = new ArrayList<>();
                for (ServiceModule s : serviceModules) {
                    if (types.equals(s.getCaseType())) {
                        caseTypeAttributes.add(new CaseTypeAttribute(s.getIssueTypeName(), s.getCaseCategory(), s.getIssueTypeId()));
                    }
                }
                caseModuleAttributeList.add(new CaseModuleAttribute(types, caseTypeAttributes));
            }
            caseModuleResponse.setCaseModuleAttributes(caseModuleAttributeList);
        }
        return caseModuleResponse;
    }

    @Override
    public ServiceModule getModuleByIssueTypeId(long issueTypeId) {
        return serviceModuleRepository.getCaseModule(issueTypeId);
    }

    @Override
    public List<String> getProductList() {
        return serviceModuleRepository.getProductList();
    }
}
