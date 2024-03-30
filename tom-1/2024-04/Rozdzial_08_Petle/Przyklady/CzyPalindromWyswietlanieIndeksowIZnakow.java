import java.util.Scanner;

public class CzyPalindromWyswietlanieIndeksowIZnakow {
  public static void main(String[] args) {
    System.out.print("Podaj słowo: ");
    String slowo = pobierzSlowo();

    boolean czyPalindrom = true;
    int dlugoscSlowa = slowo.length();

    for (int i = 0; i < dlugoscSlowa / 2; i++) {
      int indeksOdPoczatku = i;
      int indeksOdKonca = dlugoscSlowa - 1 - i;

      System.out.printf(
          "Porównuje znaki na pozycjach %d i %d\n",
          indeksOdPoczatku,
          indeksOdKonca
      );

      char znakZPoczatku = slowo.charAt(indeksOdPoczatku);
      char znakOdKonca = slowo.charAt(indeksOdKonca);

      System.out.printf("""
              Te znaki to: (od początku) '%s' \
              i (od końca) '%s'\n
              """,
          znakZPoczatku,
          znakOdKonca
      );

      if (znakZPoczatku != znakOdKonca) {
        czyPalindrom = false;
        break;
      }
    }

    if (czyPalindrom) {
      System.out.println(
          "Słowo " + slowo + " jest palindromem."
      );
    } else {
      System.out.println(
          "Słowo " + slowo + " nie jest palindromem."
      );
    }
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}