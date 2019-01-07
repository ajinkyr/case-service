package com.ybl.genie.caseservice.service.impl;

import com.ybl.genie.caseservice.model.ServiceModule;
import com.ybl.genie.caseservice.repository.ServiceModuleRepository;
import com.ybl.genie.caseservice.service.CaseModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseModuleServiceImpl implements CaseModuleService {

    @Autowired
    private ServiceModuleRepository serviceModuleRepository;

    @Override
    public List<ServiceModule> getServiceModulesByProductName(String productName) {
        return serviceModuleRepository.getByProductName(productName);
    }
}
