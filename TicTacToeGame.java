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
		whoPlaysFirst();
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
		enterYourChoice();
	}

	// this method is to enter the user choice to specific position
	public static void enterYourChoice() {
		System.out.println("Enter at which location you want to enter your " + choice);
		int location = scanner.nextInt();
		// this if condition is checking for free space
		// if free space is available then only user can make move
		// else user will get a message like location is already occupied.
		if (gameBoard[location] != choice) {
			switch (location) {
			case 1:
				gameBoard[1] = choice;
				showBoard();
				break;
			case 2:
				gameBoard[2] = choice;
				showBoard();
				break;
			case 3:
				gameBoard[3] = choice;
				showBoard();
				break;
			case 4:
				gameBoard[4] = choice;
				showBoard();
				break;
			case 5:
				gameBoard[5] = choice;
				showBoard();
				break;
			case 6:
				gameBoard[6] = choice;
				showBoard();
				break;
			case 7:
				gameBoard[7] = choice;
				showBoard();
				break;
			case 8:
				gameBoard[8] = choice;
				showBoard();
				break;
			case 9:
				gameBoard[9] = choice;
				showBoard();
				break;
			}
		} else {
			System.out.println("Location is already occupied, Enter different location : ");
			showBoard();
			enterYourChoice();
		}
	}

	// this method will decide randomly who will start the game.
	public static void whoPlaysFirst() {
		int turn = (int) Math.floor(Math.random() * 10 / 2);
		if (turn == 0) {
			System.out.println("User will start the game.");
		} else
			System.out.println("Computer will start the game.");
	}
}
