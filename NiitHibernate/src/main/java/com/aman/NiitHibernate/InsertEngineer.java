package com.aman.NiitHibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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
		 
//		 List<Engineer> list = new ArrayList<>();
//		 list.add(new Engineer(1,"Aman1","Meerut1","Developer1","Java1",101));
//		 list.add(new Engineer(2,"Aman2","Meerut2","Developer2","Java2",102));
//		 list.add(new Engineer(3,"Aman3","Meerut3","Developer3","Java3",103));
//		 list.add(new Engineer(4,"Aman4","Meerut4","Developer4","Java4",104));
//		 list.add(new Engineer(5,"Aman5","Meerut5","Developer5","Java5",105));

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
