package com.dakhani.junit.source;

public class GreetingsImpl implements Greetings{

	public String sayHello(String name) throws IllegalArgumentException{
		
		if(name == null || name == "")
			throw new IllegalArgumentException("Illegal Argument");
		
		return "Hello " + name;
	}
}
