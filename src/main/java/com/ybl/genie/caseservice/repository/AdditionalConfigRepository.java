package com.ybl.genie.caseservice.repository;

import com.ybl.genie.caseservice.model.AdditionalConfigFields;

import java.util.List;

public interface AdditionalConfigRepository {

    List<AdditionalConfigFields> getByIssueTypeID(long issueTypeId);

    List<AdditionalConfigFields> getAdditionalConfigFields();

}
