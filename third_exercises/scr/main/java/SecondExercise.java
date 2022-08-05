package main.java;

import java.util.Scanner;

public class SecondExercise {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    
    while(x != 0 && y != 0) {
      if(x > 0 && y > 0) {
        System.out.println("Primeiro");
      } else if (x > 0 && y < 0) {
        System.out.println("Segundo");
      } else if(x < 0 && y < 0) {
        System.out.println("Terceiro");
      } else {
        System.out.println("Quarto");
      }
      
      x = sc.nextDouble();
      y = sc.nextDouble();
    }

    sc.close();
  }
}
