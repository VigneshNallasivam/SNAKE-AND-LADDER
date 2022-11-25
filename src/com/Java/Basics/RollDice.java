package com.Java.Basics;
import java.util.*;
public class RollDice 
{
	public static void main(String[] args)
	{
		Random random = new Random();
		System.out.println("WELCOME TO SNAKE & LADDER GAME");
		int userPosition = 1;
		System.out.println("******Game Starts*******");
		System.out.println("Initial User Position : " +userPosition);
		
		int dice = random.nextInt(6) + 1 ;       // For Getting Dice Value from 1 to 6
		System.out.println("Rolled Dice Value : " +dice);
	}
}
