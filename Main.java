// welcome to snake and ladder program
package com.company;

public class Main {

    public static void main(String[] args) {
        int player = 0; int count = 0;
        int stay = 0; int ladder = 1; int snake = 2;
       while (player <= 100) {
           int die = (int) (Math.floor(Math.random() * 10) % 6) + 1;
           int choice = (int) Math.floor(Math.random() * 10) % 3;
                if (choice == 0) {
                     player = player + 0;
                 } else if (choice == 1) {
                     player = player + die;
                } else if (choice == 2) {
                    player = player - die;
                }
          count++;
       }
        System.out.println("game over : " + player);
        System.out.println("count " + count);
    }
}


