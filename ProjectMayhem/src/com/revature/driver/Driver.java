package com.revature.driver;

import com.revature.beans.Human;

public class Driver {
	//single line comment
	/*
	 * Multi
	 * Line
	 * Comment
	 * Ha
	 * Ha
	 */
	/*
	 * Why Java?
	 * "WORA" principle
	 * 		"Write Once, Run Anywhere"
	 * OOP
	 * Widespread use
	 * Great Documentation!
	 * Oracle owns Java
	 * 	Sun Microsystems used to own it...
	 * version 1.8 --> "Java 8"
	 * 
	 * 3 common acronyms- JDK, JRE, JVM
	 * 	JVM - Java Virtual Machine
	 * 		Converts compiles Java code into machine code that your processor can understand
	 * 		Provides portability
	 * 	JRE - Java Runtime Environment
	 * 		JVM + Libraries!
	 * 		Everything that we need to RUN Java
	 * 	JDK - Java Development Kit
	 * 		Contains JVM + JRE
	 * 		Everything that we need to WRITE Java
	 * 
	 * Object Oriented Programming
	 * 	Java is ^!
	 * 	unit of programmability is the object
	 * Objects have states and behavior
	 * States - aka fields, attributes, variables, etc
	 * Behaviors - methods
	 * Classes - blueprint or template of an object
	 */
	public static void main(String[] args) {
		/*
		 * public - access modifier, everything can access it
		 * static - do not need to instantiate to use/belongs to the class
		 * void - doesn't return anything
		 * String [] args - parameter(s) used for this method
		 */
		System.out.println("Roll Tide!");
		Human h = new Human();
		System.out.println(h);
		h.setName("Matt");
		h.setAge(34);
		h.setWeight(270);
		System.out.println(h.getName());
	}
}
