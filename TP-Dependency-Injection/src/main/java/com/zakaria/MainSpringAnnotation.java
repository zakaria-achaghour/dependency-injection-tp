package com.zakaria;

import com.zakaria.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.zakaria.dao", "com.zakaria.metier");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
