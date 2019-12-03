package com.retailstore.billing;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientBill {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Customer customer = (Customer) context.getBean("customer");

		Bill b = customer.calculateBill(customer);

		System.out.println("Total tax : " + b.getTotalCost());
		System.out.println("Total Tax total : " + b.getTotalTax());
		System.out.println("Grand total : " + b.getGrandtotal());
	}

}
