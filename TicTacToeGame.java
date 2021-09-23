package com.bridgelab.tictactoegame;

import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args) {

		System.out.println("tic tac toe game started.");
		boardCreation();
		chooseYourInputs();
	}

	// this method is for the board creation
	public static void boardCreation() {
		char[] gameBoard = new char[10];
		for (int i = 1; i < gameBoard.length; i++) {
			gameBoard[i] = ' ';
		}
	}

	// this method is for choosing the X or O
	public static void chooseYourInputs() {
		char compChoice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice for this game X or O : ");
		char choice = scanner.next().toUpperCase().charAt(0);
		if (choice == 'X' || choice == 'O') {
			System.out.println("You choice is : " + choice);
			if (choice == 'X') {
				compChoice = 'O';
			} else {
				compChoice = 'X';
			}
			System.out.println("Computer choice is : " + compChoice);
		} else {
			System.out.println("Enter the valid choice from X and O.");
			chooseYourInputs();
		}
		scanner.close();
	}
}
