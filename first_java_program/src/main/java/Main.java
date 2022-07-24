package javaCourse.first_java_program.src.main.java;

import java.util.Locale;

public class Main {
  public static void main(String[] args) {
    int y = 32;
    double x = 10.35784;
    String name = "Gabriel";
    int age = 23;
    double income = 3250.00;

    System.out.println(y);
    System.out.println(x);
    System.out.printf("%.2f%n", x);
    System.out.printf("%.4f%n", x);
    Locale.setDefault(Locale.US);
    System.out.printf("%.4f%n", x);
    System.out.println("RESULTADO = " + x + " METROS");
    System.out.printf("RESULTADO = %.2f METROS%n", x);
    System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", name, age, income);
  }
}
