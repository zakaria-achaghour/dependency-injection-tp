package com.zakaria;

import com.zakaria.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainWithSpringXml {
    public static void main(String[] args) {
        // spring version XMl
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("res:" + metier.calcul());
    }
}
