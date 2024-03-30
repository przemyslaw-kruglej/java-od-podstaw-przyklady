import java.util.Scanner;

public class PoleProstokataWersjaZOr {
  public static void main(String[] args) {
    System.out.print("Podaj pierwszy bok prostokąta: ");
    int a = pobierzLiczbe();

    System.out.print("Podaj drugi bok prostokąta: ");
    int b = pobierzLiczbe();

    // używamy operatora || - warunek będzie spełniony,
    // gdy zmienna a będzie mniejsza bądź równa 0 lub
    // zmienna b będzie mniejsza bądź równa 0
    if (a <= 0 || b <= 0) {
      System.out.println("Nieprawidłowe dane.");
    } else {
      System.out.println("Pole wynosi " + a * b);
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
