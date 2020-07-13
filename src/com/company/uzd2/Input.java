package com.company.uzd2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input extends Exception {
    public static int returnNumber() {
        boolean isNumber = false;
        int number = 0;
        Scanner sc = new Scanner(System.in);
        while (!isNumber) {
            System.out.println("Enter a number");
            String input = sc.next();
            if (isNumber(input)) {
                number = Integer.parseInt(input);
                isNumber = true;
            } else {
                System.out.println("Not a number");
            }
        }
        sc.close();
        return number;
    }
    public static boolean isNumber(String input){
        try {
            Integer.parseInt(input);
            return true;
        }catch (NumberFormatException | InputMismatchException e){
            return false;
        }
    }
}
