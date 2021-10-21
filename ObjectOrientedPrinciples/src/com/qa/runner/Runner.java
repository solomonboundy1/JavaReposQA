package com.qa.runner;

import com.qa.manager.Manager;
import com.qa.polymorphism.Parrot;
import com.qa.polymorphism.PollyTheParrot;
import com.qa.polymorphism.bird;

public class Runner {
	
	public static void main(String[] args) {
		
//		eagle ellie = new eagle("yes", 100, "Ellie");
//		
//		Dragon charizard = new Dragon("fire", true, "Charlie", 2);
//		
//		System.out.println(charizard.getName());
//		charizard.setName("He should be a dragon type");
//		System.out.println(charizard.getName());
//		
//		charizard.setWingSpan(72023);
//		System.out.println(charizard.getWingSpan());
//		charizard.sleep();
//		
//		Unicorn kyle = new Unicorn(5, true, "teal");
//		kyle.setMagical(true);
//		System.out.println(kyle.isMagical());
//		System.out.println(kyle.magicPower());
//		System.out.println(ellie.canFly());
		
		PollyTheParrot newPolly = new PollyTheParrot("Teal");
		Parrot newParrot = new Parrot("Red");
		bird newBird = new bird("White");
		
		newPolly.makeNoise();
		newParrot.makeNoise();
		newBird.makeNoise();
		
		
		bird polyMorphicBird = new PollyTheParrot("Green");
		System.out.println(polyMorphicBird.getClass().getSimpleName());
		
		Manager newManager = new Manager();
		
		newManager.addDragons();
		
		// Polymorphic qualities generally flow down the tree from parent to sub class
		
		
	}

}
