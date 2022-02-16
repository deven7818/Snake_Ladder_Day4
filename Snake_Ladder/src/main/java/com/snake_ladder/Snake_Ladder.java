package com.snake_ladder;

import java.util.Scanner;

public class Snake_Ladder {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Lader Simulator");
		int playerPosition = 0;
		int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("Dice role : " + die );
		
		System.out.println("Enter Player Name : ");
		Scanner sc = new Scanner(System.in);
		String playerName = sc.next();
		
		System.out.println("Player Name : " +playerName);
		
		int option = (int) (Math.floor(Math.random() * 10) % 3 );
		
		switch (option) {
		case 0 :
			System.out.println("No play");
			playerPosition += 0;
			break;
			
		case 1 :
			System.out.println("Ladder");
			playerPosition += die;
			break;
			
		default :
			System.out.println("Snake");
			playerPosition -= die;
			if(playerPosition < 0)
				playerPosition = 0;		
		}
		System.out.println("Player position : " + playerPosition);

	}

}
