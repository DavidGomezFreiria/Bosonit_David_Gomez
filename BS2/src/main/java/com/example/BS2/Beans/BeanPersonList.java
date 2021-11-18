package com.example.BS2.Beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanPersonList {
    @Bean
    @Qualifier("BeanPerson1")
    BeanDataList setBean1Data() {
        BeanDataList bdl = new BeanPerson1();
        bdl.setNameInterface("Paco");
        bdl.setPopulationInterface("León");
        bdl.setAgeInterface(29);
        return bdl;
    }
    @Bean
    @Qualifier("BeanPerson2")
    BeanDataList setBean2Data() {
        BeanDataList bdl = new BeanPerson3();
        bdl.setNameInterface("Antonio");
        bdl.setPopulationInterface("Lugo");
        bdl.setAgeInterface(23);
        return bdl;
    }
    @Bean
    @Qualifier("BeanPerson3")
    BeanDataList setBean3Data() {
        BeanDataList bdl = new BeanPerson2();
        bdl.setNameInterface("David");
        bdl.setPopulationInterface("Madrid");
        bdl.setAgeInterface(20);
        return bdl;
    }
}
