package com.game.strategy;

import com.game.model.Board;
import com.game.util.Input;

public class PlayerStrategyImp implements PlayerStrategy {

    @Override
    public void makeMove(Board board, char symbol) {
        boolean placed = false;

        while (!placed) {
            System.out.println("Player " + symbol + " turn");
            int row = Input.readPosition("Enter row (0-2): ");
            int col = Input.readPosition("Enter column (0-2): ");

            placed = board.placeMove(row, col, symbol);

            if (!placed) {
                System.out.println("Invalid move or cell already occupied. Try again.");
            }
        }
    }
}
