package com.game.strategy;
	
import com.game.model.Board;

public interface PlayerStrategy {
    void makeMove(Board board, char symbol);
}
