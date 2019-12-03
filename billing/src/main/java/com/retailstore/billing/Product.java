package com.retailstore.billing;
/**
 * The class represnts the products 
 */
public class Product {
	/**
	 *  The attribute represnts the product id 
	 */
	private String pid;
	/**
	 *  The attribute represnts the product name 
	 */
	private String pname;
	/**
	 *  The attribute represnts the product category 
	 */
	String category;
	/**
	 *  The attribute represnts the product quantity 
	 */
	private int quantity;
	/**
	 *  The attribute represnts the product price 
	 */
	private double price;
	
	/**
	 * @return pid
	 */
	public String getPid() {
		return pid;
	}
	/**
	 * @param pid
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}
	/**
	 * @return pname
	 */
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	/**
	 * @return category
	 */
	public String getCategory() {
		return category;
	}
	
	/**
	 * @param category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		
		this.quantity = quantity;
	}
	/**
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price
	 */
	public void setPrice(double price) {
		
		this.price = price;
	}
}
