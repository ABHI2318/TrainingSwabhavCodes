package com.aurion.model;

import com.aurion.exceptions.InsufficientStocksException;

public interface ITransactionType {
	  
	void applytranscation(Product product,int quantity) throws InsufficientStocksException;
	

}
