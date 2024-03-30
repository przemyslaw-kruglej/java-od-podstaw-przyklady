import java.util.Scanner;

public class PoleProstokata {
  public static void main(String[] args) {
    System.out.print("Podaj pierwszy bok prostokąta: ");
    int a = pobierzLiczbe();

    System.out.print("Podaj drugi bok prostokąta: ");
    int b = pobierzLiczbe();

    // używamy operatora && - warunek będzie spełniony,
    // gdy zarówno zmienna a oraz b będą większe od 0
    if (a > 0 && b > 0) {
      System.out.println("Pole wynosi " + a * b);
    } else {
      System.out.println("Nieprawidłowe dane.");
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
