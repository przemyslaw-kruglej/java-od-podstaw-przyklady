public class LiczbaSlowNieKrotszychNizSprawdzDane {
  public static void main(String[] args) {
    int x = ileSlowNieKrotszychNiz(
        4, "kot", "pies", "ptak", "wieloryb"
    );

    int y = ileSlowNieKrotszychNiz(
        10, "Ala", "ma", "kota"
    );

    System.out.printf("x: %d, y: %d\n", x, y);

    String[] slowa = null;
    int a = ileSlowNieKrotszychNiz(10, slowa);
    int b = ileSlowNieKrotszychNiz(3, "Ala", "ma", null);

    System.out.printf("a: %d, b: %d", a, b);
  }

  public static int ileSlowNieKrotszychNiz(
      int dlugosc, String... slowa
  ) {
    int ileSlow = 0;

    if (slowa != null) {
      for (String slowo : slowa) {
        if (slowo != null && slowo.length() >= dlugosc) {
          ileSlow++;
        }
      }
    }

    return ileSlow;
  }
}
