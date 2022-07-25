package main.java;

public class SecondExample {
  public static void main(String[] args) {
    double a, b, c, delta, x1, x2;

    b = 25;
    a = 32;
    c = 18;

    delta = Math.pow(b, 2.0) - 4 * a * c;

    System.out.println(delta);

    x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
    x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

    System.out.println(x1);
    System.out.println(x2);
  }
}
