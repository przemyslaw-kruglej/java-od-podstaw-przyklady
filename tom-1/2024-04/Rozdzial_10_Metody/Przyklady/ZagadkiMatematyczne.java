import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ZagadkiMatematyczne {
  public static void main(String[] args) {
    String czyKontynuowac;

    do {
      char dzialanie = wylosujDzialanie();
      int liczba1 = wylosujLiczbeZZakresu(1, 100);
      int liczba2 = wylosujLiczbeZZakresu(1, 100);
      int wynik = oblicz(liczba1, liczba2, dzialanie);

      System.out.printf(
          "\nIle to jest %d %s %d? ",
          liczba1, dzialanie, liczba2
      );
      int odpowiedzUzytkownika = pobierzLiczbe();

      if (odpowiedzUzytkownika == wynik) {
        System.out.println("Zgadza się!");
      } else {
        System.out.println(
            "Błąd! Poprawny wynik to " + wynik
        );
      }

      System.out.print("\nCzy chcesz kontynuować? [t/n] ");
      czyKontynuowac = pobierzSlowo();
    } while ("t".equals(czyKontynuowac));
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }

  public static char wylosujDzialanie() {
    char[] dzialania = { '+', '-', '*', '/' };

    int indeksZadania =
        wylosujLiczbeZZakresu(0, dzialania.length);

    return dzialania[indeksZadania];
  }

  public static int wylosujLiczbeZZakresu(int min, int max) {
    return ThreadLocalRandom.current().nextInt(min, max);
  }

  public static int oblicz(
      int liczba1, int liczba2, char dzialanie
  ) {
    return switch (dzialanie) {
      case '+' -> liczba1 + liczba2;
      case '-' -> liczba1 - liczba2;
      case '*' -> liczba1 * liczba2;
      default -> liczba1 / liczba2;
    };
  }
}
