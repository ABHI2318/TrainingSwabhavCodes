package com.aurion.model;

import com.aurion.exceptions.InsufficientStocksException;

public class RemoveStock implements ITransactionType{

	@Override
	public void applytranscation(Product product, int quantity) throws InsufficientStocksException{
		if(product.getQuantity()<quantity) {
			throw new InsufficientStocksException("not enough stocks to remove");
		}
		product.setQuantity(product.getQuantity()-quantity);
		
	}
	
	 @Override
	    public String toString() {
	        return "RemoveStock";
	    }

}