public class MetodaCzyPalindrom {
  public static void main(String[] args) {
    System.out.println(
        "Czy kajak to palindrom? " + czyPalindrom("kajak")
    );
    System.out.println(
        "Czy Kajak to palindrom? " + czyPalindrom("Kajak")
    );
    System.out.println(
        "Czy Anna to palindrom? " + czyPalindrom("Anna")
    );
    System.out.println(
        "Czy kot to palindrom? " + czyPalindrom("kot")
    );
    System.out.println(
        "Czy 'null' to palindrom? " + czyPalindrom(null)
    );
    System.out.println(
        "Czy pusty string to palindrom? " + czyPalindrom("")
    );
  }

  public static boolean czyPalindrom(String slowo) {
    if (slowo == null || slowo.length() == 0) {
      return false;
    }

    int dlugoscSlowa = slowo.length();
    String slowoMaleLitery = slowo.toLowerCase();

    for (int i = 0; i < dlugoscSlowa / 2; i++) {
      if (
          slowoMaleLitery.charAt(i) !=
          slowoMaleLitery.charAt(dlugoscSlowa - 1 - i)
      ) {
        return false;
      }
    }

    return true;
  }
}
