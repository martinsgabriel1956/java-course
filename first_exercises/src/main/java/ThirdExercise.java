package main.java;

import java.util.Locale;
import java.util.Scanner;

public class ThirdExercise {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int A, B, C, D, result;

    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    D = sc.nextInt();

    result = A * B - C * D;

    System.out.printf("DIFERENÇA = %d%n", result);

    sc.close();
  }
}
