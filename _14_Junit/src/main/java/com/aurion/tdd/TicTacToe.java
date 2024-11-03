package com.aurion.tdd;

import java.util.Scanner;

class TicTacToe {
    private char[][] board;
    private char player;
    private boolean gameOver;

    public TicTacToe() {
        board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        player = 'X';
        gameOver = false;
    }

    // Starts the game (for console-based play)
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard();
            System.out.print("Player " + player + " enter: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            System.out.println();

            if (board[row][col] == ' ') {
                board[row][col] = player;
                gameOver = haveWon(player);
                if (gameOver) {
                    System.out.println("Player " + player + " has won!");
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move. Try again!");
            }
        }
        printBoard();
    }

    public boolean haveWon(char player) {
        // Check rows
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    public void printBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }

    // Getter for the board, useful for testing purposes
    public char[][] getBoard() {
        return board;
    }

    // Getter for the current player
    public char getPlayer() {
        return player;
    }

    // Getter for game over status
    public boolean isGameOver() {
        return gameOver;
    }
}
