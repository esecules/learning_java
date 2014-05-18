package learning_java;

public class Toy {
	String name;
	Baby owner;
	
	/*
	* This is called a constructor. You use a constructor to instantiate a
	*new object of a class and set some of the instance variables if you wish.
	*You can have multiple constructors they must have the same name but must differ
	*in the number and or types of the arguments.
	*/
	public Toy(String name) {
		this.name = name;
	}
	/*
	 * This is also a valid constructor for a Toy.
	 */
	public Toy(){
	
	}
	
}
