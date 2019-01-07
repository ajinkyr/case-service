package com.ybl.genie.caseservice.repository.impl;

import com.ybl.genie.caseservice.model.ServiceModule;
import com.ybl.genie.caseservice.repository.ServiceModuleRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class ServiceModuleRepoImpl implements ServiceModuleRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<String> getProductList() {
        return null;
    }

    @Override
    public ServiceModule getServiceModule(long issueTypeId) {
        return null;
    }

    @Override
    public List<ServiceModule> getByProductName(String productName) {
            return (List<ServiceModule>)entityManager.find(ServiceModule.class,productName);
    }
}
