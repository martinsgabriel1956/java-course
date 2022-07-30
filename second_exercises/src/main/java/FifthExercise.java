package main.java;

import java.util.Scanner;

public class FifthExercise {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int code, quantityProduct;
    
    code = sc.nextInt();
    quantityProduct = sc.nextInt();
    
    double totalPay;

    if(code == 1) {
      totalPay = (double) quantityProduct * 4.0;
    } else if(code == 2) {
      totalPay = (double) quantityProduct * 4.5;
    } else if(code == 3) {
      totalPay = (double) quantityProduct * 5.0;
    } else if(code == 4) {
      totalPay = (double) quantityProduct * 2.0;
    } else {
      totalPay = (double) quantityProduct * 1.5;
    }

    System.out.printf("Total: R$ %.2f%n", totalPay);

    sc.close();
  }
}
