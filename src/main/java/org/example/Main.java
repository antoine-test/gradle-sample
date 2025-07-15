package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    char operator;
    Double op1, op2, resultat;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    op1 = input.nextDouble();

    System.out.println("Enter second number");
    op2 = input.nextDouble();

    switch (operator) {

      // performs addition between numbers
      case '+':
        resultat = op1 + op2;
        System.out.println(op1 + " + " + op2 + " = " + resultat);
        break;

      // performs subtraction between numbers
      case '-':
        resultat = op1 - op2;
        System.out.println(op1 + " - " + op2 + " = " + resultat);
        break;

      // performs multiplication between numbers
      case '*':
        resultat = op1 * op2;
        System.out.println(op1 + " * " + op2 + " = " + resultat);
        break;

      // performs division between numbers
      case '/':
        resultat = op1 / op2;
        System.out.println(op1 + " / " + op2 + " = " + resultat);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}
