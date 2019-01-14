package com.ybl.genie.caseservice.repository.impl;

import com.ybl.genie.caseservice.constant.Constant;
import com.ybl.genie.caseservice.model.CRM.ServiceModule;
import com.ybl.genie.caseservice.repository.ServiceModuleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class ServiceModuleRepoImpl implements ServiceModuleRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceModuleRepoImpl.class);

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<String> getProductList() {
        List<String> productList=entityManager.createQuery(Constant.PRODUCTLIST).getResultList();
        return productList;
    }

    @Override
    public ServiceModule getCaseModule(long issueTypeId) {
        ServiceModule serviceModule;
        try{
            serviceModule= (ServiceModule) entityManager.createQuery(Constant.MODULE)
                    .setParameter(1,issueTypeId).getSingleResult();
            LOGGER.info("Case module result : {}",serviceModule.toString());
        }catch(Exception e){
            LOGGER.error("Exception occurred while retrieving results : {} ",e);
            return null;
        }
        return serviceModule;
    }

    @Override
    public List<ServiceModule> getCaseModules(String productName) {
        List<ServiceModule> serviceModuleList= entityManager.createQuery(Constant.MODULELIST)
                .setParameter(1,productName).getResultList();
        LOGGER.info("List of modules : ",serviceModuleList);
        return serviceModuleList;
    }
}
