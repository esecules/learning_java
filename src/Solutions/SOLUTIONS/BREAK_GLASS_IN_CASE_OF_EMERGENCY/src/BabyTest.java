package Solutions.SOLUTIONS.BREAK_GLASS_IN_CASE_OF_EMERGENCY.src;

import static org.junit.Assert.*;

import org.junit.Test;


public class BabyTest {

	@Test
	public void cry() {
		Baby ward = new Baby("Grant","Ward");
		ward.cry();
		assertTrue("Ward is not crying though he should be",ward.isCrying);
		ward.comfort();
		assertFalse("Comforting Ward didn't work, he is still crying :(",ward.isCrying);
	}
	@Test
	public void friend1(){
		Baby skye = new Baby("Skye","");
		Baby ward = new Baby("Grant","Ward");
		skye.friend(ward);
		assertTrue("Skye and Ward aren't friends with eachother",skye.getFriends().contains(ward) && ward.getFriends().contains(skye));
	}
	@Test
	public void friend2(){
		Baby skye = new Baby("Skye","");
		Baby ward = new Baby("Grant","Ward");
		skye.friend(ward);
		ward.friend(skye);
		assertEquals("Skye doesnt have the right number of friends",1,skye.getFriends().size());
		assertEquals("Ward doesnt have the right number of friends",1,ward.getFriends().size());
	}
	@Test
	public void name(){
		Baby phil = new Baby("Phil","Coulson");
		assertTrue("That's not Phil's real name",phil.getName().equals("Phil Coulson"));
	}
	@Test
	public void getToy(){
		Baby romanov  = new Baby("Natasha","Romanov");
		Toy t1 = new Toy("Machete");
		Toy t2 = new Toy("Teddy Bear");
		romanov.getToy(t1);
		romanov.getToy(t2);
		assertTrue(romanov.getToys().contains(t1));
		assertTrue(romanov.getToys().contains(t2));
		assertEquals(2,romanov.getToys().size());
	}
	
	@Test
	public void getToy2(){
		Baby romanov  = new Baby("Natasha","Romanov");
		Baby fury = new Baby("Nick","Fury");
		Toy t1 = new Toy("Machete");
		Toy t2 = new Toy("Teddy Bear");
		romanov.getToy(t1);
		romanov.getToy(t2);
		fury.getToy(t2);
		assertTrue(romanov.getToys().contains(t1));
		assertTrue(romanov.getToys().contains(t2));
		assertEquals(2,romanov.getToys().size());
		assertFalse(fury.getToys().contains(t2));
		assertEquals(0,fury.getToys().size());
	}
	
	@Test
	public void giveToy(){
		Baby romanov  = new Baby("Natasha","Romanov");
		Baby hill  = new Baby("Maria","Hill");
		Toy t1 = new Toy("Machete");
		Toy t2 = new Toy("Teddy Bear");
		romanov.getToy(t1);
		romanov.getToy(t2);
		romanov.gievToy(t1, hill);
		assertTrue(romanov.getToys().contains(t2));
		assertEquals(1,romanov.getToys().size());
		assertTrue(hill.getToys().contains(t1));
		assertEquals(1,hill.getToys().size());
	}


}
