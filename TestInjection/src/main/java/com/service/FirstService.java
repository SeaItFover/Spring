package com.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class FirstService implements IService{

    SecondService secondService;
    //IService service;


    public SecondService getSecondService() {
        return secondService;
    }

    public void setSecondService(SecondService secondService) {
        this.secondService = secondService;
    }
}
