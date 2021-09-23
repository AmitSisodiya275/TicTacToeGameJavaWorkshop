package com.bridgelab.tictactoegame;

import java.util.Scanner;

public class TicTacToeGame {
	static char[] gameBoard = new char[10];
	static char choice, compChoice;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Tic-Tac-Toe game Started.");
		boardCreation();
		chooseYourInputs();
		showBoard();
	}

	// this method is for the board creation
	public static void boardCreation() {

		// char[] gameBoard = new char[10];
		for (int i = 1; i < gameBoard.length; i++) {
			gameBoard[i] = ' ';
		}
	}

	// this method is for choosing the X or O
	public static void chooseYourInputs() {

		// Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice for this game X or O : ");
		choice = scanner.next().toUpperCase().charAt(0);
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
	}

	// this method is to show board
	public static void showBoard() {
		System.out.println("| " + gameBoard[1] + "|" + gameBoard[2] + " |" + gameBoard[3] + " |");
		System.out.println("|--------|");
		System.out.println("| " + gameBoard[4] + "|" + gameBoard[5] + " |" + gameBoard[6] + " |");
		System.out.println("|--------|");
		System.out.println("| " + gameBoard[7] + "|" + gameBoard[8] + " |" + gameBoard[9] + " |");
	}
}
