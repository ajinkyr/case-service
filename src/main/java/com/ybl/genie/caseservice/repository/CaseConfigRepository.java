package com.ybl.genie.caseservice.repository;

import com.ybl.genie.caseservice.model.CRM.CaseFields;

import java.util.List;

public interface CaseConfigRepository {

    CaseFields getCaseField(String attributeName);


    List<CaseFields> getCaseFields();

}
