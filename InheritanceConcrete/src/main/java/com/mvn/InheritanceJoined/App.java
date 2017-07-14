package com.mvn.InheritanceJoined;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Employee e1= new Employee("Rohit");
    	ContractEmployee ce1= new ContractEmployee(30);
    	ce1.setName("Sachin");
    	RegularEmployee re1= new RegularEmployee(30000);
    	re1.setName("Sagar");
    	
    	Session session= HibernateUtil.getSessionFactory().openSession();
    	session.beginTransaction();
    	//session.persist(e1);
    	session.persist(ce1);
    	session.persist(re1);
    	session.getTransaction().commit();
    	session.close();
    	
    }
}
