package com.example.BS2.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController {
    @Autowired
    @Qualifier("Bean1")
    BeanDataList bean1;

    @Autowired
    @Qualifier("Bean2")
    BeanDataList bean2;

    @Autowired
    @Qualifier("Bean3")
    BeanDataList bean3;

    @GetMapping("/controller/bean/{beanType}")
    public BeanDataList getMapBean(@PathVariable String beanType) {
        if(beanType.contains("bean1")) {
            return bean1;
        }
        else if(beanType.contains("bean2")) {
            return bean2;
        }
        else if(beanType.contains("bean3")) {
            return bean3;
        }
        return null;
    }
}
