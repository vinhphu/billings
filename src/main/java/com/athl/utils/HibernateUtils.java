package com.athl.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {
//	private static SessionFactory sessionFactory;
//	
//
//	public static SessionFactory getSessionFactory() {
//		if (sessionFactory == null) {
//			// loads configuration and mappings
//			Configuration configuration = new Configuration().configure("/hibernate.cfg.xml");
//			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//					.applySettings(configuration.getProperties()).build();
//
//			// builds a session factory from the service registry
//			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//		}
//
//		return sessionFactory;
//	}
	 private static final SessionFactory sessionFactory;
	    
	    static {
	        try {
	            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	        } catch (Throwable ex) {
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	    
	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
}