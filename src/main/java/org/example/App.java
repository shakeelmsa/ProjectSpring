package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{     //This class contains the main method,
      // which is the entry point for the Java application.
    public static void main( String[] args )
    {
        //This line loads the Spring configuration file (spring.xml).
        // The ApplicationContext is responsible for creating and managing the beans (objects) defined in the XML configuration.
        //ClassPathXmlApplicationContext ->It load bean definition from  xml configuration file
        // from class path main/resources/spring.xml
        //xml configuration file-spring.xml file
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // It retrieves the bean (object) of the Employee class from the Spring container
        // using the getBean() method and the bean's ID (employee).
       // The object is typecast to Employee class.

        Employee obj = (Employee) context.getBean("employee");

        //This line sets the Salary attribute of the Employee object to 100.
         //obj.Salary =100;





       obj.giventask();
       obj.salarybankaccount();
       obj.currentaccount();
       obj.electronic();

       Labour obj1 = (Labour) context.getBean("labour");
       System.out.println(obj1.getLabid());
       obj1.labourenrollment();

       Salary obj2 = (Salary) context.getBean("salary");
       obj2.bankaccount();

       Salary obj3 = (Salary) context.getBean("salary");
       obj3.newaccount();

    }
}
