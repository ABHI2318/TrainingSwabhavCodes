package com.aurionpro.dowhile;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int row;int column;int y;
        System.out.println("the table is : ");
        row=1;
        do {
        	column=1;
        	do{
        		y=row*column;
        		System.out.println(" "+y);
        		column+=1;
        		
        	}
        	while(column<=3) ;
        		System.out.println("\n");
        		row+=1;
        	
        }
        while(row<=10);
	}

}
