package com.ybl.genie.caseservice.repository;

import com.ybl.genie.caseservice.model.CRM.OptionsetFields;

import java.util.List;

public interface OptionsetRepository {

    List<OptionsetFields> getOptionsetFields(String attributeName);

}
