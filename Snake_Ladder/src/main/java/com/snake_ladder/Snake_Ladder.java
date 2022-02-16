package com.snake_ladder;

public class Snake_Ladder {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Lader Simulator");
		int playerPosition = 0;
		int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("Dice role : " + die );

	}

}
