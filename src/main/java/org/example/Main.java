package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        //Variable Declaration
        while(true) {
            double num_1;
            double num_2;
            int choice;
            double result = 0;
            String answer;


            System.out.print("Enter your first number: ");
            num_1 = scanner.nextInt();
            System.out.print("Enter your second number: ");
            num_2 = scanner.nextInt();

            displaychoices();
            //choices
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    result = add(num_1, num_2);
                    break;
                case 2:
                    result = subtract(num_1, num_2);
                    break;
                case 3:
                    result = multiply(num_1, num_2);
                    break;
                case 4:
                    if (num_2 != 0) {
                        result = num_1 / num_2;
                    } else {
                        System.out.println("Error");
                    }
                    break;
            }
            // Display
            System.out.println("Result: " + result);


            System.out.print("Do you want to perform another calculation? (yes/no): ");
            answer = scanner.next();

            if (!answer.equalsIgnoreCase("yes")) {
                break;
            }
        }
        scanner.close();
    }

    public static void displaychoices(){
        System.out.println("Choose an operation: (Choose the corresponding number only)");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
    }

    public static double add(double num_1, double num_2){
        return  num_1 + num_2;
    }

    public static double subtract(double num_1, double num_2){
    return  num_1 - num_2;
    }

    public static double multiply(double num_1, double num_2){
    return  num_1 * num_2;
    }

    public static double divide(double num_1, double num_2) {
        if (num_2 != 0) {
            return num_1 / num_2;
        } else {
            System.out.println("Error");
            return 0;
        }
    }
    }