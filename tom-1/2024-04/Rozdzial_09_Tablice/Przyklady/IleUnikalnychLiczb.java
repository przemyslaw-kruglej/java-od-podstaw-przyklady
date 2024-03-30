public class IleUnikalnychLiczb {
  public static void main(String[] args) {
    int[] liczby = { 5, 10, 5, 15, -100, 10, 10, 15 };

    int ileUnikalnych = 0;

    for (int i = 0; i < liczby.length; i++) {
      boolean czyLiczbaBylaWczesniej = false;

      for (int j = i - 1; j >= 0; j--) {
        if (liczby[j] == liczby[i]) {
          czyLiczbaBylaWczesniej = true;
          break;
        }
      }

      if (!czyLiczbaBylaWczesniej) {
        ileUnikalnych++;
      }
    }

    System.out.println(
        "Liczba unikalnych wartości: " + ileUnikalnych
    );
  }
}
