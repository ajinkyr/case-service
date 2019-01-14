package com.ybl.genie.caseservice.repository.impl;

import com.ybl.genie.caseservice.model.CRM.OptionsetFields;
import com.ybl.genie.caseservice.repository.OptionsetRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class OptionsetRepoImpl implements OptionsetRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<OptionsetFields> getOptionsetFields(String attributeName) {
        String hql ="FROM OptionsetFields where attributeName = ?1";
        List<OptionsetFields> optionsetFieldsList = entityManager.createQuery(hql)
                .setParameter(1,attributeName).getResultList();
        return optionsetFieldsList;
       }

}
