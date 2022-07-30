package main.java;

import java.util.Locale;
import java.util.Scanner;

public class FifthExercise {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int codePiece1, pieceQtd1, codePiece2, pieceQtd2; 
    double unitValue1, unitValue2, valuePaid;

    codePiece1 = sc.nextInt();
    pieceQtd1 = sc.nextInt();
    unitValue1 = sc.nextDouble();
    codePiece2 = sc.nextInt();
    pieceQtd2 = sc.nextInt();
    unitValue2 = sc.nextDouble();

    valuePaid = pieceQtd1 * unitValue1 + pieceQtd2 * unitValue2;

    System.out.printf("VALOR A PAGAR = R$ %.2f%n", valuePaid);

    sc.close();
  }
}
