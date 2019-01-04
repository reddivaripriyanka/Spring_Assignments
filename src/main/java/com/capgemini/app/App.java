package com.capgemini.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.app.bean.Organization;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	 ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    	 Organization obj = (Organization) context.getBean("organization");
    	
        System.out.println( obj.getBoardMembers());
        System.out.println( obj.getBranchManagers());
        System.out.println( obj.getCities());
        System.out.println(obj.getDateOfEstablishment());
        System.out.println(obj.getIpAddresses());
        System.out.println(obj.getOrgId());
        System.out.println(obj.getName());
        System.out.println(obj.getShareValue());
        
    }
}
