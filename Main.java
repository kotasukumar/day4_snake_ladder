// welcome to snake and ladder program
package com.company;

public class Main {

    public static void main(String[] args) {
        int player = 0; int count = 0;
        int stay = 0, ladder = 1, snake = 2;
       while (player != 100) {
           int die = (int) (Math.floor(Math.random() * 10) % 6) + 1;
           int choice = (int) Math.floor(Math.random() * 10) % 3;
           if (player>=0 && player<100) {
               if (choice == stay) {
                   player = player + 0;
                   System.out.println("position: " + player);
               }
               else if (choice == ladder) {
                   player = player + die;
                   System.out.println("position: " + player);
               }
               else if (choice == snake) {
                   player = player - die;
                   System.out.println("position: " + player);
               }
           }
           else if (player < 0){
               player = 0;
               System.out.println("game is restarted");
               System.out.println("position: " + player);
           }
           else if (player >= 100){
               player = player - die;
               System.out.println("position: " + player);
           }
                count++;
       }
        System.out.println("game over : " + player);
        System.out.println("count " + count);
    }
}


