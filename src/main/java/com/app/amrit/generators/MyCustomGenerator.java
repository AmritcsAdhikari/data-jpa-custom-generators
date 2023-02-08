package com.app.amrit.generators;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class MyCustomGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

        String prefix = "PRD-";
        int random = new Random().nextInt();
        random = Math.abs(random);
        String date = new SimpleDateFormat("ddMMyy").format(new Date());

        return prefix + date + ":" + random;
    }
}
