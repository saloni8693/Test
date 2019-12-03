package com.retailstore.billing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CustomerTest {

	Customer customerdetails=new Customer();
	/**
	 *  This method  test total cost with valid product
	 */
	@Test
	public void testcalculateTotalCost() {
		
		List<Product> product1ist= getProductList();

		double totalCost=0;
		totalCost=customerdetails.calculateTotalCost(product1ist, totalCost);
		assertEquals(7550,totalCost ,0.0001);
	}
	
	/**
	 * This method  test total tax with valid product
	 * 
	 */
	@Test
	public void testcalculateTotalTaxWithValidProducts() throws ProductNotFoundException {
		
		List<Product> product1ist= getProductList();

		double totalcost=7550;
		double totaltax = customerdetails.calculateTotalTax(product1ist, totalcost);
		assertEquals(2265,totaltax ,0.0001);
	}
	
	/**
	 * This method  test total tax when there is no product
	*/
	@Test
	public void testcalculateTotalTaxWithNoProduct() throws ProductNotFoundException {
		
		List<Product> product=null;
		double totalCost=0;
		totalCost=customerdetails.calculateTotalTax(product, totalCost);
		assertEquals(0,totalCost ,0.0001);
	}
	private List<Product> getProductList() {
		List<Product> product1ist=new ArrayList<Product>();
		Product product1 =new Product();
		product1.setCategory("A");
		product1.setPid("1");
		product1.setPname("television");
		product1.setPrice(1200);
		product1.setQuantity(5);
		   
		
		Product product2 =new Product();
		product2.setCategory("B");
		product2.setPid("2");
		product2.setPname("cricket-bat");
		product2.setPrice(100);
		product2.setQuantity(15);
		
		Product product3 =new Product();
		product3.setCategory("C");
		product3.setPid("3");
		product3.setPname("eclairs");
		product3.setPrice(1);
		product3.setQuantity(50);
		product1ist.add(product1);
		product1ist.add(product2);
		product1ist.add(product3);
		return product1ist;
		
	}

	
	
	/**
	 * This method tests exception
	 */
	@Test
	public void testcalculateTotalTaxWithInvalidCategory() {
	  boolean thrown = false;
	  try {
           Customer customerdetails=new Customer();
           List<Product> product1ist =new ArrayList<Product>();
			Product product1 =new Product();
			product1.setCategory("D");
			product1.setPid("3");
			product1.setPname("dettol");
			product1.setPrice(120);
			product1.setQuantity(45);
			product1ist.add(product1);
			double totalCost=0;
			customerdetails.calculateTotalTax(product1ist,totalCost);
			} catch (ProductNotFoundException e) {
				 thrown = true;
			}
		
	  assertTrue(thrown);
	}
}


