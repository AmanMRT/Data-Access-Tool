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
//		 List<Engineer> list = new ArrayList<>();
//		 list.add(new Engineer(1,"Aman1","Meerut1","Developer1","Java1",101));
//		 list.add(new Engineer(2,"Aman2","Meerut2","Developer2","Java2",102));
//		 list.add(new Engineer(3,"Aman3","Meerut3","Developer3","Java3",103));
//		 list.add(new Engineer(4,"Aman4","Meerut4","Developer4","Java4",104));
//		 list.add(new Engineer(5,"Aman5","Meerut5","Developer5","Java5",105));

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
