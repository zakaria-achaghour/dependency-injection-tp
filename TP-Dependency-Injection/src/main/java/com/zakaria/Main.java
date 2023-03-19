package com.zakaria;

import com.zakaria.dao.DaoImpl;
import com.zakaria.dao.IDao;
import com.zakaria.metier.MetierImpl;

public class Main {
    public static void main(String[] args) {
        IDao dao = new DaoImpl(); // static instantiation
        MetierImpl metier = new MetierImpl(dao);
       // metier.setDao(dao); // dependency injection
        System.out.println(metier.calcul());

    }
}