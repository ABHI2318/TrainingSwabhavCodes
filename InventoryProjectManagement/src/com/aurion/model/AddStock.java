package com.aurion.model;

public class AddStock implements ITransactionType{

	@Override
	public void applytranscation(Product product, int quantity) {
		product.setQuantity(product.getQuantity()+quantity);
	}
	  @Override
	    public String toString() {
	        return "AddStock";
	    }
}