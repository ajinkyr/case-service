package com.ybl.genie.caseservice.repository.impl;

import com.ybl.genie.caseservice.model.CRM.AdditionalConfigMaster;
import com.ybl.genie.caseservice.repository.AdditionalConfigRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class AdditionalConfigRepoImpl implements AdditionalConfigRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<AdditionalConfigMaster> getAdditionalConfig(long issueTypeId) {
        String hql="FROM AdditionalConfigMaster where issueTypeId = ?1";
        List<AdditionalConfigMaster> additionalConfigMasterList = entityManager.createQuery(hql)
                .setParameter(1,issueTypeId).getResultList();
        return additionalConfigMasterList;
    }

    @Override
    public List<Object> getAdditionalFields(long issueTypeId) {
        String hql="select ac.issueTypeId,cf.attributeName,\n" +
                "cf.attributeDisplayName,cf.attributeType,\n" +
                "os.attributeIndex,os.attributeValue \n" +
                "FROM AdditionalConfigMaster ac \n" +
                "\n" +
                "right join CaseFields cf on ac.fieldName = cf.attributeName\n" +
                "\n" +
                "left join OptionsetFields os on cf.attributeName = os.attributeName where ac.issueTypeId=?1";

       List<Object> additionalFields=entityManager.createQuery(hql)
               .setParameter(1,issueTypeId).getResultList();
        return additionalFields;
    }
}
