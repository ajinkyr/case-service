package com.ybl.genie.caseservice.repository;

import com.ybl.genie.caseservice.model.CRM.AdditionalConfigMaster;

import java.util.List;

public interface AdditionalConfigRepository {

    List<AdditionalConfigMaster> getAdditionalConfig(long issueTypeId);


    List<Object> getAdditionalFields(long issueTypeId);
}
