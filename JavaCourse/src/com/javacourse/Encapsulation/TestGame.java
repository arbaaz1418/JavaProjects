package com.javacourse.Encapsulation;

public class TestGame {

	public static void main(String args[])
	{
		/*Player player=new Player();
		player.name="Arbaz";
		player.health=100;
		player.weapon="Gun";
		
		int damage=10;
		
		player.loseHealth(damage);
		System.out.println("Damaged...!!!Remaining Heath "+player.heathRemaining());
				*/
		
		AdvancedPlayer player = new AdvancedPlayer("Arbaz ", 170, "Gun");
		System.out.println("nitial health is "+player.getHealth());
	}
}
