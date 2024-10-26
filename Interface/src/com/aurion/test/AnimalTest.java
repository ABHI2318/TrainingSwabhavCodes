package com.aurion.test;

import com.aurion.model.Animal.Animal;
import com.aurion.model.Animal.Cat;
import com.aurion.model.Animal.Dog;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.sleep();
		Cat cat=new Cat();
		cat.eat();
		System.out.println(Animal.Max_age);//can access via animal as well
		System.out.println(Dog.Max_age);//can access via 
		Animal.info();//only interface can access directly that method
		dog.run();//by default method class can be accessed without disturbing other classes 
		

	}

}
