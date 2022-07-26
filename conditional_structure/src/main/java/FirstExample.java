import java.util.Scanner;

public class FirstExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hour;
    System.out.println("How many hours?");
    hour = sc.nextInt();

    if(hour < 12) {
      System.out.println("Morning!");
    } else if(hour < 18) {
      System.out.println("Good Afternoon!");
    } else {
      System.out.println("Good Night!");
    }

    sc.close();
  }
}
