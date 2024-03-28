package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		
			// playerHealth to store your health - set it equal to 100
		int playerHealth = 100;
			// dragonHealth to store the dragon's health - set it equal to 100
		int dragonHealth = 100;
		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
		
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
		int playerAttack = 0;
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.
		int dragonAttack = 0;
		
		//  This while statement will cause the game attack code to repeat
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON

				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
			String attack1 = JOptionPane.showInputDialog("Do you want to attack the drangon with a yell or kick?");
				// 4. If they typed in "yell":
				if (attack1.equals("yell")) {
					  // -- Find a random number between 0 and 10 and store it in playerAttack. Use
					  // ran.nextInt(10)
					playerAttack = ran.nextInt(10);
				}
				// 5. If they typed in "kick":
				if (attack1.equals("kick")) {
					  // -- Find a random number between 0 and 25 and store it in playerAttack.
					playerAttack = ran.nextInt(25);
				}
				// 6. Subtract the player attack value from the dragon's health
			dragonHealth -= playerAttack;
			// THE DRAGON RETALIATES
			
				// 7. Find a random number between 0 and 35 and store it in dragonAttack
				dragonAttack = ran.nextInt(35);
				// 8. Subtract the dragon attack value from the player's health
			playerHealth -= dragonAttack;
			// ASSESS THE DAMAGE

				// 9. If the player's health is less than or equal to 0, the game is over,
				//    call the playerLost() method
				if (playerHealth <= 0) {
					playerLost();
				}
				
				// 10. If the dragon's health is less than or equal to 0, the game is over,
				//     call the dragonLost() method
				if (dragonHealth <= 0) {
					dragonLost();
				}
			
				// 11.  Pop up a message that tells us how much health the player and
				// 		dragon have left.
				System.out.println("Player health: " + playerHealth + "\n");
				
				System.out.println("Dragon health: " + dragonHealth + "\n");
			
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
				System.out.println("Player health lost:" + dragonAttack + "\n");
				
				System.out.println("Dragon health lost:" + playerAttack + "\n");

		} // this is the end of the while loop

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
		System.out.println("PLAYER LOST. NO TREASURE FOUND");

		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
		System.out.println("DRAGON LOST. PLAYER WINS GOLD");

		System.exit(0);   //This code ends the program
	}

}
