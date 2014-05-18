package Solutions.SOLUTIONS.BREAK_GLASS_IN_CASE_OF_EMERGENCY.src;

import java.util.ArrayList;


public class Baby {
	String firstName, lastName;
	Boolean isCrying = false;
	private ArrayList<Baby> friends = new ArrayList<Baby>();
	private ArrayList<Toy> toys = new ArrayList<Toy>();
	
	public Baby(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}

	public ArrayList<Baby> getFriends() {
		return friends;
	}

	public ArrayList<Toy> getToys() {
		return toys;
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
		if (!toys.contains(t)){
			if (t.setOwner(this))
				this.toys.add(t);
		}
	}
	
	public void gievToy(Toy t, Baby b){
		this.toys.remove(t);
		t.setOwner(null);
		b.getToy(t);
	}
	
	public void friend(Baby b) {
		if( !friends.contains(b) ) {
			friends.add(b);
			b.friend(this);
		}
	}


}
