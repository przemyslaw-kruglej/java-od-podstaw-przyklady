import java.util.Scanner;

public class CzyPalindrom {
  public static void main(String[] args) {
    System.out.print("Podaj słowo: ");
    String slowo = pobierzSlowo();

    boolean czyPalindrom = true;
    int dlugoscSlowa = slowo.length();

    for (int i = 0; i < dlugoscSlowa / 2; i++) {
      char znakZPoczatku = slowo.charAt(i);
      char znakOdKonca = slowo.charAt(dlugoscSlowa - 1 - i);

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