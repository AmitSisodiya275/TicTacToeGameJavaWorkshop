package com.bridgelab.tictactoegame;

public class TicTacToeGame {

	public static void main(String[] args) {

		System.out.println("tic tac toe game started.");
		boardCreation();
	}

	// this method is for the board creation
	public static void boardCreation() {
		char[] gameBoard = new char[10];
		for (int i = 1; i < gameBoard.length; i++) {
			gameBoard[i] = ' ';
		}
	}
}
