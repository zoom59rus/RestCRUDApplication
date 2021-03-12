package com.nazarov.javadeveloper.module24;

import com.nazarov.javadeveloper.module24.entity.Event;
import com.nazarov.javadeveloper.module24.entity.File;
import com.nazarov.javadeveloper.module24.entity.User;
import com.nazarov.javadeveloper.module24.service.MainService;
import com.nazarov.javadeveloper.module24.service.impl.MainServiceImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Id;
import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {
    private static ObjectFactory INSTANCE = null;
    private Map<String, Object> beans = new HashMap<>();

    private ObjectFactory() {
    }

    public static ObjectFactory getObjectFactory(){
        if(INSTANCE == null){
            synchronized (ObjectFactory.class){
                if(INSTANCE == null){
                    INSTANCE = new ObjectFactory();
                }
            }
        }

        return INSTANCE;
    }

    private SessionFactory createSessionFactory(){
        return new Configuration()
                .addAnnotatedClass(Event.class)
                .addAnnotatedClass(File.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
    }

    private MainServiceImpl createMainService(){
        return new MainServiceImpl();
    }

    public MainServiceImpl getMainService(){
        MainServiceImpl mainServiceImpl = (MainServiceImpl) beans.get("MainService");
        if(mainServiceImpl == null){
            beans.put("MainService", createMainService());
            mainServiceImpl = (MainServiceImpl) beans.get("MainService");
        }

        return mainServiceImpl;
    }

    public SessionFactory getSessionFactory(){
        SessionFactory sessionFactory = (SessionFactory) beans.get("sessionFactory");

        if(sessionFactory == null){
            beans.put("sessionFactory", createSessionFactory());
            sessionFactory = (SessionFactory) beans.get("sessionFactory");
        }

        return sessionFactory;
    }

}
