package main;

import java.util.Scanner;
import java.util.Random;

public class Minesweeper {
	
	public static void main(String[] args) {
		Random randomInt = new Random();
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What is the width your grid?");
		int gridWidth = userInput.nextInt();
		System.out.println("What is the height of your grid?");
		int gridHeight = userInput.nextInt();
		System.out.println("How many mines in your grid?");
		int totalMines = userInput.nextInt();
		int[][] mineSweeperGrid = new int[gridWidth][gridHeight];
		
		int currentMines = 0;
		while (currentMines < totalMines) {
			int mineRow = randomInt.nextInt(gridWidth);
			int mineColumn = randomInt.nextInt(gridHeight);
				if (mineSweeperGrid[mineRow][mineColumn] == 9) {
						continue;
				} else {
					mineSweeperGrid[mineRow][mineColumn] = 9;
					currentMines += 1;
				}	
		}
		
		
		int row = 0;
		for (int[] column : mineSweeperGrid) {
			System.out.println();
			for (row = 0; row < gridWidth; row++) {
				System.out.print(column[row] + " ");
			}
		}
		
		userInput.close();
	}
	
	

}
