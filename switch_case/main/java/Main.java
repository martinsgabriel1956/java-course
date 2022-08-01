package main.java;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();
    String day;

    switch(number) {
      case 1:
        day = "Domingo";
        break;
      case 2:
        day = "Segunda";
        break;
      case 3:
        day = "Terça";
        break;
      case 4:
        day = "Quarta";
        break;
      case 5:
        day = "Quinta";
        break;
      case 6:
        day = "Sexta";
        break;
      case 7:
        day = "Sabado";
        break;
      default:
        day = "Valor invalido";
        break;
    }

    System.out.printf("Dia da semana: %s%n", day);
    sc.close();
  }
}
