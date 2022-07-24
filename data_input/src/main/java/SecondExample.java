package main.java;

import java.util.Scanner;

public class SecondExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x;

    x = sc.nextInt();

    System.out.println("Você digitou: " + x);

    sc.close();
  }
}
