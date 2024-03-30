import java.util.Scanner;

public class PodzielnaPrzezTrzy {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę: ");
    int liczba = pobierzLiczbe();

    if (liczba % 3 == 0) {
      System.out.println(
          "Ta liczba jest podzielna przez 3."
      );
    } else {
      System.out.println(
          "Ta liczba nie jest podzielna przez 3."
      );
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
