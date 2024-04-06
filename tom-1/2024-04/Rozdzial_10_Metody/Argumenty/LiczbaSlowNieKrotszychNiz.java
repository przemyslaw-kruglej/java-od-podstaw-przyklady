public class LiczbaSlowNieKrotszychNiz {
  public static void main(String[] args) {
    int x = ileSlowNieKrotszychNiz(
        4, "kot", "pies", "ptak", "wieloryb"
    );

    int y = ileSlowNieKrotszychNiz(
        10, "Ala", "ma", "kota"
    );

    System.out.printf("x: %d, y: %d", x, y);
  }

  public static int ileSlowNieKrotszychNiz(
      int dlugosc, String... slowa
  ) {
    int ileSlow = 0;

    for (String slowo : slowa) {
      if (slowo.length() >= dlugosc) {
        ileSlow++;
      }
    }
    return ileSlow;
  }
}
