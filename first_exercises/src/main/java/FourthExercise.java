package main.java;

import java.util.Locale;
import java.util.Scanner;

public class FourthExercise {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int employeeNumber;
    double hoursWorked, salary, resultSalary;

    employeeNumber = sc.nextInt();
    hoursWorked = sc.nextDouble();
    salary = sc.nextDouble();

    resultSalary = hoursWorked * salary;

    System.out.printf("NUMBER = %d%n", employeeNumber);
    System.out.printf("Salary = U$ %.2f%n", resultSalary);

    sc.close();
  }
}
