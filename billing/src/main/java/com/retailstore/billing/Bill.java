package com.retailstore.billing;

public class Bill {
	
	/**
	 * The attribute represnts the totalCost
	 */
	private Double totalCost;
	/**
	 * The attribute represnts the totalTax
	 */
	private Double totalTax;
	/**
	 * The attribute represnts the grandtotal
	 */
	private Double grandtotal;
	/**
	 * @return grandtotal
	 */
	public Double getGrandtotal() {
		return grandtotal;
	}
	/**
	 * @param grandtotal
	 */
	public void setGrandtotal(Double grandtotal) {
		this.grandtotal = grandtotal;
	}

	/**
	 * @return totalCost
	 */
	public Double getTotalCost() {
		return totalCost;
	}
	/**
	 * @param totalCost
	 */
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	/**
	 * @return totalTax
	 */
	public Double getTotalTax() {
		return totalTax;
	}
	/**
	 * @param totalTax
	 */
	public void setTotalTax(Double totalTax) {
		this.totalTax = totalTax;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bill [totalCost=" + totalCost + ", totalTax=" + totalTax + ", grandtotal=" + grandtotal + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((grandtotal == null) ? 0 : grandtotal.hashCode());
		result = prime * result + ((totalCost == null) ? 0 : totalCost.hashCode());
		result = prime * result + ((totalTax == null) ? 0 : totalTax.hashCode());
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
		Bill other = (Bill) obj;
		if (grandtotal == null) {
			if (other.grandtotal != null)
				return false;
		} else if (!grandtotal.equals(other.grandtotal))
			return false;
		if (totalCost == null) {
			if (other.totalCost != null)
				return false;
		} else if (!totalCost.equals(other.totalCost))
			return false;
		if (totalTax == null) {
			if (other.totalTax != null)
				return false;
		} else if (!totalTax.equals(other.totalTax))
			return false;
		return true;
	}

}
