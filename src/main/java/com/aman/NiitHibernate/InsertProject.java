package com.aman.NiitHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class InsertProject
{
	 public static void main( String[] args )
	    {
		 
		 Project project = new Project();
		 
		 //project.setPcode(101);
		 project.setPtitle("Title4");
		 project.setPsize(40);
		 project.setPduration(4.3f);
		 project.setPcost(40000.0f);
		 project.setPteamsize(40);
		 project.setPtech("Java4");

		Configuration con = new Configuration().configure().addAnnotatedClass(Project.class);	//Config to use SessionFactory
	    
	    //Use this line or Just use SessionFactory Part
	    ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			       
	    SessionFactory factory = con.buildSessionFactory(registry);		// builds a SessionFactory method
	    
	    Session session = factory.openSession(); 	//will provide a Session for the MySQL 
	    
	    Transaction trans = session.beginTransaction();		// Transaction is used to make table of Student in the Database
	    session.save(project);
	  
	   // session.save(list);		//	Method used to save Student object to the DataBase 
	    
	    trans.commit();
	    }	
}
