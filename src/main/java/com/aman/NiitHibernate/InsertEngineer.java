package com.aman.NiitHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class InsertEngineer
{
	 public static void main( String[] args )
	    {
		 Engineer eng = new Engineer();
		 //eng.setEid();
		 eng.setEname("Aman4");
		 eng.setEaddress("Meerut4");
		 eng.setEdesignation("Developer4");
		 eng.setEskill("Java4");
		 eng.setEprojectID(104);
		 

		Configuration con = new Configuration().configure().addAnnotatedClass(Engineer.class);	//Config to use SessionFactory
	    
	    //Use this line or Just use SessionFactory Part
	    ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			       
	    SessionFactory factory = con.buildSessionFactory(registry);		// builds a SessionFactory method
	    
	    Session session = factory.openSession(); 	//will provide a Session for the MySQL 
	    
	    Transaction trans = session.beginTransaction();		// Transaction is used to make table of Student in the Database
	    session.save(eng);
	  
	   // session.save(list);		//	Method used to save Student object to the DataBase 
	    
	    trans.commit();
	    }
}
