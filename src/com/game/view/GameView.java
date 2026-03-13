package com.game.view;

import com.game.model.Board;

public class GameView {

    public void printBoard(Board board) {
        char[][] b = board.getBoard();
        for (int i = 0; i < 3; i++) {
            System.out.println(b[i][0] + " | " + b[i][1] + " | " + b[i][2]);
        }
        System.out.println();
    }
}
