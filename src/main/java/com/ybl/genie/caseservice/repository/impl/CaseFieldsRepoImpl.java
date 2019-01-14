package com.ybl.genie.caseservice.repository.impl;

import com.ybl.genie.caseservice.model.CRM.CaseFields;
import com.ybl.genie.caseservice.repository.CaseConfigRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class CaseFieldsRepoImpl implements CaseConfigRepository {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public CaseFields getCaseField(String attributeName) {
        String hql="FROM CaseFields where attributeName = ?1";
        CaseFields caseFields= (CaseFields) entityManager.createQuery(hql)
                .setParameter(1,attributeName).getSingleResult();
        return caseFields;
    }

    @Override
    public List<CaseFields> getCaseFields() {
        String hql="FROM CaseFields";
        List<CaseFields> caseFieldsList=entityManager.createQuery(hql).getResultList();
        return caseFieldsList;
    }
}
