package com.tec.foodDelivery;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.Order;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Session session=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).addAnnotatedClass(Orders.class).buildSessionFactory().openSession();
        
		
		
		  Orders o1=new Orders(1,"chicken",200); 
		  Orders o2=new Orders(2,"burger",250);
		  Orders o3=new Orders(3,"pizza",350);
		  
		  List<Orders> orders1=new ArrayList<Orders>(); orders1.add(o1);
		  orders1.add(o2); 
		  orders1.add(o3);
		 
		 Customer customer1=new Customer(); 
		 customer1.setCusId(10);
		  customer1.setName("sujatha"); 
		  Customer customer2=new Customer();
		
		  customer2.setCusId(11);
		  customer2.setName("bharathi");
		  
		  
		  
		  customer1.setOrders(orders1); 
		  o1.setCustomer(customer1);
		  o2.setCustomer(customer1); 
		  o3.setCustomer(customer2);
		  
		  
 		  Transaction tx=session.beginTransaction();
		  
		  session.save(o1); session.save(o2); session.save(o3);
		 
 		
		Customer cus = session.get(Customer.class, 10);
		System.out.println(cus);
		  tx.commit();
		 
			
      session.close();
	
        
    }
}
