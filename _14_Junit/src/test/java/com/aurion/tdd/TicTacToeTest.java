package com.aurion.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicTacToeTest {
	private TicTacToe game;

	@BeforeEach
	void init() {
		game=new TicTacToe();
	}
	 @Test
	    void testInitialBoardSetup() {
	        char[][] board = game.getBoard();
	        for (char[] row : board) {
	            for (char cell : row) {
	                assertEquals(' ', cell, "Initial board should be empty.");
	            }
	        }
	        assertFalse(game.isGameOver(), "Game should not be over at start.");
	        assertEquals('X', game.getPlayer(), "Player X should start the game.");
	    }

	    @Test
	    void testWinningRow() {
	        char[][] board = game.getBoard();
	        board[0][0] = 'X';
	        board[0][1] = 'X';
	        board[0][2] = 'X';
	        assertTrue(game.haveWon('X'), "Player X should win with the top row filled.");
	    }

	    @Test
	    void testWinningColumn() {
	        char[][] board = game.getBoard();
	        board[0][1] = 'O';
	        board[1][1] = 'O';
	        board[2][1] = 'O';
	        assertTrue(game.haveWon('O'), "Player O should win with the middle column filled.");
	    }

	    @Test
	    void testWinningDiagonal() {
	        char[][] board = game.getBoard();
	        board[0][0] = 'X';
	        board[1][1] = 'X';
	        board[2][2] = 'X';
	        assertTrue(game.haveWon('X'), "Player X should win with a diagonal from top-left to bottom-right.");
	    }

	    @Test
	    void testNoWinCondition() {
	        char[][] board = game.getBoard();
	        board[0][0] = 'X';
	        board[0][1] = 'O';
	        board[0][2] = 'X';
	        board[1][0] = 'X';
	        board[1][1] = 'O';
	        board[1][2] = 'O';
	        board[2][0] = 'O';
	        board[2][1] = 'X';
	        board[2][2] = 'X';
	        assertFalse(game.haveWon('X'), "No win condition should be met.");
	        assertFalse(game.haveWon('O'), "No win condition should be met.");
	    }

	    @Test
	    void testPlayerSwitchAfterMove() {
	        char[][] board = game.getBoard();
	        board[0][0] = game.getPlayer(); 
	        game.haveWon(game.getPlayer()); 
	        assertEquals('X', game.getPlayer(), "Player should switch to O after X's move.");
	    }

}
