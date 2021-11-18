package com.example.BS2.Beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanList {
    @Bean
    @Qualifier("Bean1")
    BeanDataList setBean1Data() {
        BeanDataList bdl = new Bean1Impl();
        bdl.setNameInterface("Paco");
        bdl.setPopulationInterface("León");
        bdl.setAgeInterface(29);
        return bdl;
    }
    @Bean
    @Qualifier("Bean2")
    BeanDataList setBean2Data() {
        BeanDataList bdl = new Bean2Impl();
        bdl.setNameInterface("Antonio");
        bdl.setPopulationInterface("Lugo");
        bdl.setAgeInterface(23);
        return bdl;
    }
    @Bean
    @Qualifier("Bean3")
    BeanDataList setBean3Data() {
        BeanDataList bdl = new Bean3Impl();
        bdl.setNameInterface("David");
        bdl.setPopulationInterface("Madrid");
        bdl.setAgeInterface(20);
        return bdl;
    }
}
