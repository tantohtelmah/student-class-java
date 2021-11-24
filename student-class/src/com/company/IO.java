package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IO {

    public static int getInt(){

        boolean repeat;
        int input = 0;
        do {
            repeat = false;
            try {
                input = new Scanner(System.in).nextInt();
                break;
            }catch (InputMismatchException ex){
                System.out.println("Input is not an integer, try again");
                repeat = true;
            }
        }while (repeat);

        return input;
    }
    public static double getDouble(){

        boolean repeat;
        double input = 0;
        do {
            repeat = false;
            try {
                input = new Scanner(System.in).nextDouble();
                break;
            }catch (InputMismatchException ex){
                System.out.println("Input is not an integer, try again");
                repeat = true;
            }
        }while (repeat);

        return input;
    }

}
