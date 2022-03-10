// welcome to snake and ladder program
package com.company;

public class Main {

    public static void main(String[] args) {
	int player = 0;
    int die = (int) (Math.floor(Math.random() * 10) % 6) + 1;
        System.out.println("die ; " + die);
    }
}
