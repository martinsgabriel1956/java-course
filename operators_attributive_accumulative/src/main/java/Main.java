package main.java;

import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int minutes = sc.nextInt();
    double bill = 50.00;

    if(minutes > 100) {
      bill += (minutes - 100) * 2.00;
    }

    System.out.printf("Valor da conta: R$ %.2f%n", bill);

    sc.close();
  }
}
