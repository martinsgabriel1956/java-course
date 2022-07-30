package main.java;

import java.util.Scanner;

public class FourthExercise {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int maxHour, minHour, initialHour, finalHour, result;
    
    minHour = 1;
    maxHour = 24;

    
    initialHour = sc.nextInt();
    finalHour = sc.nextInt();

    if(initialHour < finalHour) {
      result = initialHour - finalHour;
    } else {
      result = maxHour - initialHour + finalHour;
    }

    System.out.printf("O JOGO DUROU %d HORA(S)", result);
    
    sc.close();
  }
}
