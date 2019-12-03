package com.retailstore.billing;

/**
 * This class represnts exception thrown when invalid category product is found
 *
 */
public class ProductNotFoundException extends Exception {
	
	public ProductNotFoundException(){}
	/**
	 * @param msg
	 */
	public ProductNotFoundException(String msg){
	super(msg);
	}
}
