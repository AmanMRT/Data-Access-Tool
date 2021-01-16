package com.aman.HibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Insert {

	 public static void main( String[] args )
	    {
		 
		 Student std = new Student();
		 std.setName("Priya");
		 std.setAddress("Muzaffarnagar");
		 std.setPhone(789456230);
		 		 
		 Course course = new Course();
		 course.setCname("Java8");
		 course.setDuration(12);
		 course.setFee(500000);
		 
		// std.setCourse(course);		//for one to one mapping
		 
		std.getList().add(course);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Course.class) ;	//Config to use SessionFactory
		    
	    //Use this line or Just use SessionFactory Part
	    ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			       
	    SessionFactory factory = con.buildSessionFactory(registry);		// builds a SessionFactory method
	    
	    Session session = factory.openSession(); 	//will provide a Session for the MySQL 
	    
	    Transaction trans = session.beginTransaction();		// Transaction is used to make table of Student in the Database
	   
	    session.save(std);		//	Method used to save Student object to the DataBase 
	    session.save(course);	//	Method used to save Course object to the DataBase 
	    		
	    trans.commit();
	    }
}