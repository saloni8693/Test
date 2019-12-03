package com.retailstore.billing;

import java.util.List;
/**
 * The class represnts the each customer order
 */
public class Order {

	/**
	 * The attribute represnts the customerid
	 */
	private String customerid;
	/**
	 * The attribute represnts the productlist
	 */
	private List<Product> productlist;
	/**
	 * @return customerid
	 */
	public String getCustomerid() {
		return customerid;
	}
	/**
	 * @param customerid
	 */
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	/**
	 * @return productlist
	 */
	public List<Product> getProductlist() {
		return productlist;
	}
	/**
	 * @param productlist
	 */
	public void setProductlist(List<Product> productlist) {
		this.productlist = productlist;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Order [customerid=" + customerid + ", productlist=" + productlist + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerid == null) ? 0 : customerid.hashCode());
		result = prime * result + ((productlist == null) ? 0 : productlist.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (customerid == null) {
			if (other.customerid != null)
				return false;
		} else if (!customerid.equals(other.customerid))
			return false;
		if (productlist == null) {
			if (other.productlist != null)
				return false;
		} else if (!productlist.equals(other.productlist))
			return false;
		return true;
	}
	
}
