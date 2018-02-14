package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        runCalculatorMenu();
    }

    public static void runCalculatorMenu() {
        Calculator calculator = new Calculator();
        int firstNumber;
        int secondNumber;
        String operation;



            operation = scanner.nextLine();

            System.out.println("Please enter a first number!");
            firstNumber = scanner.nextInt();
            System.out.println("Please enter a second number!");
            secondNumber = scanner.nextInt();
            switch (operation) {
                case "+":
                    System.out.println(calculator.plus(firstNumber, secondNumber));
                    break;
                case "-":
                    System.out.println(calculator.minus(firstNumber, secondNumber));
                    break;
                case "*":
                    System.out.println(calculator.multiplication(firstNumber, secondNumber));
                    break;
                case "/":
                    System.out.println(calculator.devide(firstNumber, secondNumber));
                    break;
                case "/.":
                    System.out.println( calculator.dev(firstNumber, secondNumber ));
                    break;
                case "^":
                    System.out.println( calculator.pwr(firstNumber, secondNumber));
            }

    }

    }
