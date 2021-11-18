package com.example.BS2.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController {
    @Autowired
    @Qualifier("BeanPerson1")
    BeanDataList beanPerson1;

    @Autowired
    @Qualifier("BeanPerson2")
    BeanDataList beanPerson2;

    @Autowired
    @Qualifier("BeanPerson3")
    BeanDataList beanPerson3;

    @GetMapping("/controller/bean/{beanType}")
    public BeanDataList getMapBean(@PathVariable String beanType) {
        if(beanType.contains("bean1")) {
            return beanPerson1;
        }
        else if(beanType.contains("bean2")) {
            return beanPerson2;
        }
        else if(beanType.contains("bean3")) {
            return beanPerson3;
        }
        return null;
    }
}
