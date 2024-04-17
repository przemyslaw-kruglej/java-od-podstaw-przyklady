import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SprawdzanieMnozenia {
  public static void main(String[] args) {
    int liczba1 =
        ThreadLocalRandom.current().nextInt(20) + 1;

    int liczba2 =
        ThreadLocalRandom.current().nextInt(20) + 1;

    System.out.printf("""
        Wylosowałem liczby %d i %d. \
        Ile wynosi ich iloczyn?
        """,
        liczba1, liczba2
    );

    System.out.print("Podaj wynik: ");
    int wynikOdUzytkownika = pobierzLiczbe();
    int wynikMnozenia = liczba1 * liczba2;

    if (wynikOdUzytkownika == wynikMnozenia) {
      System.out.println("To poprawna odpowiedź!");
    } else {
      System.out.printf(
          "Błędna odpowiedź - ten to wynosi %d.",
          wynikMnozenia
      );
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
