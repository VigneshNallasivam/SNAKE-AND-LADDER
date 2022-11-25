package com.Java.Basics;
import java.util.Random;
public class RepeatToWin100 
{
	public static void main(String[] args)
	{
		Random random = new Random();
		System.out.println("WELCOME TO SNAKE & LADDER GAME");
		int userPosition = 1;
		System.out.println("******Game Starts*******");
		System.out.println("Initial User Position : " +userPosition);
		
		while(userPosition != 100)
		{
		int dice = random.nextInt(6) + 1 ;       // For Getting Dice Value from 1 to 6
		System.out.println("Rolled Dice Value : " +dice);
		
		int option = random.nextInt(3);
		switch(option)
		{
		case 0 : System.out.println("No Play!!");
		         break;
		
		case 1 : System.out.println("Ladder!!");
		         userPosition = userPosition + dice;
		         System.out.println("Now the User Is In Position : " +userPosition);
                 break;
        
		case 2 : System.out.println("Snake!!");
		         userPosition = userPosition - dice;
		         if(userPosition < 1)
		         {
		        	 userPosition = 1;
		         }
                 System.out.println("Now the User Is In Position : " +userPosition);
                 break;
		}
		}
	}
}
