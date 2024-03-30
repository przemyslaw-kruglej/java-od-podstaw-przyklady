public class ZliczZnakiWArgumentach {
  public static void main(String[] args) {
    if (czyWyswietlicPomoc(args)) {
      wyswietlPomoc();
    } else {
      wyswietlLiczbyZnakow(args);
    }
  }

  public static boolean czyWyswietlicPomoc(
      String[] argumentyProgramu
  ) {
    return argumentyProgramu.length == 0 ||
        "--help".equalsIgnoreCase(argumentyProgramu[0]);
  }

  public static void wyswietlPomoc() {
    System.out.println("""
        Program liczy znaki w przekazanych \
        do niego argumentach.

        Użycie: ZliczZnakiWArgumentach Ala ma kota

        Opcje/argumenty (muszą być pierwszym argumentem):
          --help          wyświetla informacje o programie
          -b lub --bare   wypisuje wyniki w skróconym formacie
        """);
  }

  public static boolean czyWyswietlicDaneWKrotkimFormacie(
      String[] argumenty
  ) {
    return "--bare".equalsIgnoreCase(argumenty[0]) ||
        "-b".equalsIgnoreCase(argumenty[0]);
  }

  public static void wyswietlLiczbyZnakow(
      String[] argumenty
  ) {
    boolean wyswietlDaneWKrotkimFormacie =
        czyWyswietlicDaneWKrotkimFormacie(argumenty);

    int indeksPierwszegoSlowa =
        wyswietlDaneWKrotkimFormacie ? 1 : 0;

    for (
        int i = indeksPierwszegoSlowa;
        i < argumenty.length;
        i++
    ) {
      if (wyswietlDaneWKrotkimFormacie) {
        System.out.print(
            argumenty[i].length() +
                (i < argumenty.length - 1 ? "," : "")
        );
      } else {
        System.out.printf(
            "Długość słowa %s wynosi %d\n",
            argumenty[i],
            argumenty[i].length()
        );
      }
    }
  }
}
