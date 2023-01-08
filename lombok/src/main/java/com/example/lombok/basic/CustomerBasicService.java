package com.example.lombok.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerBasicService {

    private final static Logger LOGGER =  LoggerFactory.getLogger(CustomerBasicService.class);

    @Autowired
    private final CustomerBasic customerBasic;

    public CustomerBasicService(CustomerBasic customerBasic) {
        this.customerBasic = customerBasic;
    }

    public void getABC() {
        LOGGER.info("Inside CustomerLombokService getABC()");
        System.out.println(customerBasic.toString());
    }


}
