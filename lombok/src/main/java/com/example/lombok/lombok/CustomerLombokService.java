package com.example.lombok.lombok;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@AllArgsConstructor
public class CustomerLombokService {

    private final CustomerLombok customerLombok;
    private final CustomerLombok2 customerLombok2;

    public void getABC() {
        log.info("Inside CustomerLombokService getABC()");
        System.out.println(customerLombok);
        System.out.println(customerLombok2);
    }


}
