// welcome to snake and ladder program
package com.company;

public class Main {

    public static void main(String[] args) {
	int player = 0;
    int die = (int) (Math.floor(Math.random() * 10) % 6) + 1;
    int choice = (int) Math.floor(Math.random() * 10) %3;
    int stay = 0, ladder = 1, snake = 2;
        System.out.println("die ; " + die);
        if (choice == stay){
            System.out.println("stay at same position");
        }
        else if (choice == ladder){
            System.out.println("move forward");
        }
        else if (choice == snake){
            System.out.println("come back");
        }
    }
}
