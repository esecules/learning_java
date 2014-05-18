package learning_java;
import java.util.ArrayList;


public class Baby {
	String firstName, lastName;
	Boolean isCrying = false;
	private ArrayList<Baby> friends = new ArrayList<Baby>();
	private ArrayList<Toy> toys = new ArrayList<Toy>();
	
	public Baby(String first, String last) {
		// TODO initialize name fields
	}

	public void cry() {
		// TODO update isCrying accordingly	
	}

	public void comfort() {
		// TODO update isCrying accordingly
	}

	public String getName() {
		// TODO Return full name in one string
		return "That's not my name!";
	}
	public void getToy(Toy t){
		//TODO add t to your list of Toys and make yourself the toy's owner
	}
	
	public void gievToy(Toy t, Baby b){
		//TODO give your toy to another baby.
	}
	
	public void friend(Baby b) {
		// TODO add this baby to your friends list and add yourself to theirs
		//if a baby is already in the friend list don't add them a second time!
		
	}

	public ArrayList<Baby> getFriends() {
		return friends;
	}

	public ArrayList<Toy> getToys() {
		return toys;
	}

	

	
	


}
