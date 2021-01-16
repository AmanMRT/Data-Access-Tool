package com.aman.NiitHibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HQLQueriesEngineer {

	 public static void main( String[] args )
	    {
		 
		 	Configuration con = new Configuration().configure().addAnnotatedClass(Engineer.class);	//Config to use SessionFactory
		    
		    //Use this line or Just use SessionFactory Part
		    ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
				       
		    SessionFactory factory = con.buildSessionFactory(registry);		// builds a SessionFactory method
		    
		    Session session = factory.openSession(); 	//will provide a Session for the MySQL 
		    
		    Transaction trans = session.beginTransaction();		// Transaction is used to make table of Student in the Database
		    
//		    Query q = session.createQuery("from SoftwareEngineer");		//using SoftwareEngineer as table name is changed in DB
//		    
//		    List<Engineer> list = q.list();
//		
//			 for(Engineer eng : list)
//			 {
//				 System.out.println(eng);
//			 }
//			
			 // Use to fetch some columns
			  Query q = session.createQuery("select Id, Name from Engineer");
			  
			  List<Object[]> list = (List<Object[]>) q.list(); 
			  System.out.println("ID" + "\t" + "Name"); 
			  for(Object[] s : list) 
			  { 
				  System.out.println(s[0] + "\t" + s[1]); 
			  }
				 
			 session.getTransaction().commit();
	    }
}
