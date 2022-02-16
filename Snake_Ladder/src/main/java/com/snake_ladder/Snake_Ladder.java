package com.snake_ladder;

import java.util.Scanner;

public class Snake_Ladder {

	public static final int winningPosition = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Lader Simulator");

		System.out.println("Enter Player Name : ");
		Scanner sc = new Scanner(System.in);
		String playerName = sc.next();

		System.out.println("Player Name : " + playerName);

		int playerPosition = 0;

		while (winningPosition > playerPosition) {

			// get random number for dice between 1-6
			int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			System.out.println("Dice role : " + die);

			// get random number for snake , ladder ,no play
			int option = (int) (Math.floor(Math.random() * 10) % 3);

			int remainigPosition = winningPosition - playerPosition;

			if (remainigPosition >= die) {

				switch (option) {
				case 0:
					System.out.println("No play :" + 0);
					playerPosition += 0;
					break;

				case 1:
					System.out.println("Ladder : " + "+" + die);
					playerPosition += die;
					break;

				default:
					System.out.println("Snake : " + "+" + die);
					playerPosition -= die;
					if (playerPosition < 0)
						playerPosition = 0;
				}// end of switch
			} // end of if
		}
		System.out.println("Player position : " + playerPosition);

	}

}
