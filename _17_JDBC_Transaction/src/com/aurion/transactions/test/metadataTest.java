package com.aurion.transactions.test;

import com.aurion.transactions.model.metadataDB;

public class metadataTest {

	   public static void main(String[] args) {
	        metadataDB metaDB = new metadataDB();
	        metaDB.connect();
	        metaDB.displayDatabaseMetadata();
	        metaDB.displayTableMetadata("new_table"); 
	      
	}
}
