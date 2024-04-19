public class Szyfrator {
  public static void main(String[] args) {
    if (czyWyswietlicPomoc(args)) {
      wyswietlPomoc();
    } else {
      if (czyPoprawneArgumenty(args)) {
        String trybDzialania = args[0];
        String dane = args[1];
        System.out.println(
            przetworzDane(trybDzialania, dane)
        );
      } else {
        poinformujZeNieprawidloweDane();
      }
    }
  }

  public static boolean czyWyswietlicPomoc(String[] args) {
    return args.length == 0 ||
           "--help".equalsIgnoreCase(args[0]);
  }

  public static void wyswietlPomoc() {
    System.out.println("""
        Program szyfruje bądź odszyfrowuje swój argument.
        Szyfr polega na dodaniu litery 'x' po każdym znaku
        nie będącym spacją.

        Użycie: Szyfrator -e "Ala ma kota"
                Szyfrator -d "Axlxax mxax kxoxtxax"

        Opcje:
          --help            wyświetla informacje o programie
          -e lub --encode   szyfruje argument następujący po tej opcji
          -d lub --decode   odszyfrowuje argument następujący po tej opcji
        """);
  }

  public static boolean czyPoprawneArgumenty(String[] args) {
    return args.length == 2 &&
        ("--encode".equalsIgnoreCase(args[0]) ||
        "-e".equalsIgnoreCase(args[0]) ||
        "--decode".equalsIgnoreCase(args[0]) ||
        "-d".equalsIgnoreCase(args[0]));
  }

  public static String przetworzDane(
      String trybDzialania, String dane
  ) {
    if ("-e".equalsIgnoreCase(trybDzialania) ||
        "--encode".equalsIgnoreCase(trybDzialania)) {
      return zaszyfruj(dane);
    } else {
      return odszyfruj(dane);
    }
  }

  public static void poinformujZeNieprawidloweDane() {
    System.out.println("""
        Nieprawidłowe argumenty.
        Użyj argumentu --help aby wyświetlić
        informacje o programie.
        """
    );
  }

  public static String zaszyfruj(String tekst) {
    String wynik = "";

    for (char znak : tekst.toCharArray()) {
      wynik += Character.isLetter(znak) ? znak + "x" : znak;
    }

    return wynik;
  }

  public static String odszyfruj(String tekst) {
    String wynik = "";

    for (int i = 0; i < tekst.length();) {
      char znak = tekst.charAt(i);
      i += Character.isLetter(znak) ? 2 : 1;
      wynik += znak;
    }

    return wynik;
  }
}
