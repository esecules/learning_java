package Solutions.SOLUTIONS.BREAK_GLASS_IN_CASE_OF_EMERGENCY.src;

import java.util.ArrayList;


public class Baby {
	String firstName, lastName;
	Boolean isCrying = false;
	ArrayList<Baby> friends = new ArrayList<Baby>();
	ArrayList<Toy> toys = new ArrayList<Toy>();
	
	public Baby(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}

	public void cry() {
		isCrying = true;
	}

	public void comfort() {
		isCrying = false;
	}

	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	public void getToy(Toy t){
		//TODO add t to your list of Toys and make yourself the toy's owner
		if (!toys.contains(t)){
			t.owner = this;
			this.toys.add(t);
		}
	}
	
	public void gievToy(Toy t, Baby b){
		this.toys.remove(t);
		b.getToy(t);
	}
	
	public void friend(Baby b) {
		// TODO add this baby to your friends list and add yourself to theirs
		//if a baby is already in the friend list don't add them a second time!
		if( !friends.contains(b) ) {
			friends.add(b);
			b.friend(this);
		}
		
	}


}
