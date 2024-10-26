package com.aurion.test;

import com.aurion.model.ConsumerQ;
import com.aurion.model.ProducerQ;
import com.aurion.model.Q;

public class  QFixed {
	 public static void main(String args[]) {
		 Q q = new Q();
		 new ProducerQ(q);
		 new ConsumerQ(q);
		 System.out.println("Press Control-C to stop.");
		 }
		}
