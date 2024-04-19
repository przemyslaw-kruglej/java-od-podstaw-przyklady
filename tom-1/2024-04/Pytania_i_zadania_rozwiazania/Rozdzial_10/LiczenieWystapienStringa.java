public class LiczenieWystapienStringa {
  public static void main(String[] args) {
    if (czyWyswietlicPomoc(args)) {
      wyswietlPomoc();
    } else {
      System.out.println(
          policzWystapienia(args[0], args[1])
      );
    }
  }

  public static boolean czyWyswietlicPomoc(String[] args) {
    return args.length == 0 ||
        "--help".equalsIgnoreCase(args[0]) ||
        args.length != 2;
  }

  public static void wyswietlPomoc() {
    System.out.println("""
        Program zlicza ile razy jego drugi argument
        występuje w pierwszym argumencie. Wielkość
        liter jest rozróżniana.

        Użycie: LiczenieWystapienStringa "Ala ma kota" ma

        Opcje:
          --help  wyświetla informacje o programie
        """);
  }

  public static int policzWystapienia(
      String tekst, String szukany
  ) {
    int liczbaWystapien = 0;

    if (tekst != null && szukany != null) {
      int pozycjaWystapienia = tekst.indexOf(szukany);

      while (pozycjaWystapienia != -1) {
        pozycjaWystapienia = tekst.indexOf(
            szukany, pozycjaWystapienia + szukany.length()
        );
        liczbaWystapien++;
      }
    }

    return liczbaWystapien;
  }
}
