import java.util.Scanner;

public class SprawdzMianownik {
  public static void main(String[] args) {
    System.out.print("Podaj pierwszą liczbę: ");
    int x = pobierzLiczbe();

    System.out.print("Podaj drugą liczbę: ");
    int y = pobierzLiczbe();

    if (y != 0) {
      System.out.printf(
          "Wynik dzielenia tych liczb to %.2f",
          (double) x / y
      );
    } else {
      System.out.println("Nie można dzielić przez zero!");
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
