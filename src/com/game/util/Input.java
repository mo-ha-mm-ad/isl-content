package com.game.util;

import java.util.Scanner;

public class Input {

    private static final Scanner sc = new Scanner(System.in);

    public static int readPosition(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                int value = Integer.parseInt(sc.nextLine().trim());

                if (value >= 0 && value <= 2) {
                    return value;
                } else {
                    System.out.println("Enter a value between 0 and 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
