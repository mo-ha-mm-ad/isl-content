package com.game.model;

public class Board {

    private final char[][] board = new char[3][3];

    public Board() {
        resetBoard();
    }

    public void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public boolean placeMove(int row, int col, char symbol) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        if (board[row][col] == ' ') {
            board[row][col] = symbol;
            return true;
        }
        return false;
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWin(char p) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == p && board[i][1] == p && board[i][2] == p)
                return true;
        }

        for (int i = 0; i < 3; i++) {
            if (board[0][i] == p && board[1][i] == p && board[2][i] == p)
                return true;
        }

        return (board[0][0] == p && board[1][1] == p && board[2][2] == p)
            || (board[0][2] == p && board[1][1] == p && board[2][0] == p);
    }

    public char[][] getBoard() {
        return board;
    }
}
