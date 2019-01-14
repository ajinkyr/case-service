package com.ybl.genie.caseservice.service.impl;

import com.ybl.genie.caseservice.repository.AdditionalConfigRepository;
import com.ybl.genie.caseservice.service.AdditionalConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdditonalConfigServiceImpl implements AdditionalConfigService {

    @Autowired
    private AdditionalConfigRepository additionalConfigRepo;

    @Override
    public List<Object> getAdditionalFields(long issueTypeId) {
        return additionalConfigRepo.getAdditionalFields(issueTypeId);
    }
}
