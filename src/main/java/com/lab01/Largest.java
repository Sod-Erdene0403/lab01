package com.lab01;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double n1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double n2 = input.nextDouble();

        System.out.print("Enter third number: ");
        double n3 = input.nextDouble();

        if(n1 >= n2) {
            if(n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        } else {
            if(n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }
        input.close();
    }
}
