package com.zakaria.metier;

import com.zakaria.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{
   // Couplage faible
    @Autowired
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double v = dao.getData();
        double res = v*99;
        return res;
    }

    // dependency injection
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
