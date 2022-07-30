package main.java;

import java.util.Locale;
import java.util.Scanner;

public class First_Exercise {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    
    Scanner sc = new Scanner(System.in);

    int firstNumber, secondNumber, result;

    firstNumber = sc.nextInt();
    secondNumber = sc.nextInt();

    result = firstNumber + secondNumber;

    System.out.printf("SOMA = %d%n", result);

    sc.close();
  }
}
