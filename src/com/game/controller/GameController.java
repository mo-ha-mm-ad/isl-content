package com.game.controller;

import com.game.model.Board;
import com.game.strategy.PlayerStrategyImp;
import com.game.view.GameView;

public class GameController {

    private static GameController instance;

    private final Board board;
    
    private final GameView view;

    private GameController() {
        board = new Board();
        view = new GameView();
    }

    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    public void play() {
    	PlayerStrategyImp playerX = new PlayerStrategyImp();
    	PlayerStrategyImp playerO = new PlayerStrategyImp();
    	
        char current = 'X';

        while (true) {
            view.printBoard(board);

            if (current == 'X') {
                playerX.makeMove(board, 'X');
            } else {
                playerO.makeMove(board, 'O');
            }

            if (board.checkWin(current)) {
                view.printBoard(board);
                System.out.println("Player " + current + " wins!");
                board.resetBoard();
                current = 'X';
                System.out.println("Game restarted\n");
                continue;
            }

            if (board.isBoardFull()) {
                view.printBoard(board);
                System.out.println("Game Draw! Restarting game...");
                board.resetBoard();
                current = 'X';
                System.out.println("Game restarted\n");
                continue;
            }

            current = (current == 'X') ? 'O' : 'X';
        }
    }
}
