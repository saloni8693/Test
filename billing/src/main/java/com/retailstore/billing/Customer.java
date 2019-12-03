package com.retailstore.billing;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * The class represnts the customer 
 */
public class Customer {
	
	/**
	 *  The attribute represnts the order customer places 
	 */
	@Autowired
	Order order;

	/**
	 * @return order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * This method calculates total bill
	 * @param customer
	 * @return Bill
	 */
	public Bill calculateBill(Customer customer) {
		Bill bill = new Bill();
		double totalCost = 0;
		double totalTax = 0;
		double grandTotal = 0;
		if (customer.getOrder() != null && !customer.getOrder().getProductlist().isEmpty()) {
			totalCost = calculateTotalCost(customer.getOrder().getProductlist(), totalCost);
			try {
				totalTax = calculateTotalTax(customer.getOrder().getProductlist(), totalCost);
			} catch (ProductNotFoundException e) {

			}
			
		}
		
		grandTotal = totalCost + totalTax;
		bill.setTotalCost(totalCost);
		bill.setTotalTax(totalTax);
		bill.setGrandtotal(grandTotal);
		return bill;

	}

	/** This method calculates  totaltax
	 * @param list
	 * @param totalCost
	 * @return totaltax
	 * @throws ProductNotFoundException
	 */
	public double calculateTotalTax(List<Product> list, double totalCost) throws ProductNotFoundException {
		double totaltax = 0;
		if (list != null && !list.isEmpty()) {

			Set<Object> productCategoryList = list.stream().map(x -> x.category).collect(Collectors.toSet());
			if (productCategoryList.contains("A") || productCategoryList.contains("B")
					|| productCategoryList.contains("C")) {
				if (productCategoryList.contains("A")) {
					totaltax = totalCost * 0.2;
				}
				if (productCategoryList.contains("B")) {
					totaltax = totaltax + (totalCost * 0.1);
				}
			} else {
				throw new ProductNotFoundException("Product with invalid category Found.");
			}
		}
		return totaltax;

	}

	/**This method calculates  total cost of products
	 * @param list
	 * @param totalCost
	 * @return totalCost
	 */
	public double calculateTotalCost(List<Product> list, Double totalCost) {

		for (Product product : list) {
			double totalPrice = product.getPrice() * product.getQuantity();
			totalCost = totalPrice + totalCost;
		}

		return totalCost;
	}

}

