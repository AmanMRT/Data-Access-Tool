package com.aman.NiitHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class FetchProject {
	 
	public static void main( String[] args )
	    {
		 
		Project project = new Project();
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Project.class);	//Config to use SessionFactory
	    
	    //Use this line or Just use SessionFactory Part
	    ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			       
	    SessionFactory factory = con.buildSessionFactory(registry);		// builds a SessionFactory method
	    
	    Session session = factory.openSession(); 	//will provide a Session for the MySQL 
	    
	    Transaction trans = session.beginTransaction();		// Transaction is used to make table of Student in the Database
	    
	    project = (Project) session.get(Project.class, 104);	//get-> null if no row found  load-> error if no row of that id is found
	    
	    System.out.println(project);
	    trans.commit();
	    }	

}
