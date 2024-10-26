package com.aurion.arrayss;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,5,6,7,8};
        int n=a.length,peak=a[0];
        if(n==1) {
        	System.out.println("the peak element is: "+a[0]);
        }
        for(int i=0;i<n;i++) {
        	if(i==0) {
        		if(a[i+1]>a[i]);
        		peak=a[i+1];
        	}
        	else if(i==(n-1)) {
        	 if(a[i-1]<a[i]);
        	 peak=a[i];
        
        	}
        	
        	else {
        		if(a[i+1]<a[i] && a[i-1]<a[i]);
        		peak=a[i];
        	}
        }
        System.out.println("peak element is" +peak);
	}

}
