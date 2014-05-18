package Solutions.SOLUTIONS.BREAK_GLASS_IN_CASE_OF_EMERGENCY.src;


public class Toy {
	final String name;
	private Baby owner;
	
	/*
	* This is called a constructor. You use a constructor to instantiate a
	*new object of a class and set some of the instance variables if you wish.
	*You can have multiple constructors they must have the same name but must differ
	*in the number and or types of the arguments.
	*/
	public Toy(String name) {
		this.name = name;
	}

	public Baby getOwner() {
		return owner;
	}

	public Boolean setOwner(Baby owner) {
		if( this.owner == null ){
			this.owner = owner;
			System.out.println("New Owner " + owner.getName());
		}
		else if (owner == null){
			System.out.println("Giving up toy " + this.owner.getName());
			this.owner = owner;
		}
		else {
			System.out.println("Stealing toy!! " + owner.getName());
			return false;
		}
		
		return true;
	}
	
	
	
}
