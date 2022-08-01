package main.java;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();
    int sum = 0;
    
    while(number != 0) {
      sum += number;
      number = sc.nextInt();
    }

    System.out.println(sum);

    sc.close();
  }
}
