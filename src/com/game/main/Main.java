package com.game.main;

import com.game.controller.GameController;


public class Main {

    public static void main(String[] args) {

        GameController game = GameController.getInstance();
        
        game.play();
    }
}
