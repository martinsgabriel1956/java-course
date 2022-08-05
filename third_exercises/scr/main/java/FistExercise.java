package main.java;

import java.util.Scanner;

public class FistExercise {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int myPassword = sc.nextInt();
    int correctPassword = 2002;

    while(myPassword != correctPassword) {
      System.out.println("Senha Invalida");
      myPassword = sc.nextInt();
      break;
    };
    
    System.out.println("Acesso Permitido");
    
    sc.close();
  }
}
