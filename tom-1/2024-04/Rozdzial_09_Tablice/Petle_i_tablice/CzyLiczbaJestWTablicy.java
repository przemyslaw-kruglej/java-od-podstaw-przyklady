public class CzyLiczbaJestWTablicy {
  public static void main(String[] args) {
    boolean znaleziona = false;
    int[] liczby = { -20, 105, 0, 26, -99, 7, 1026 };

    int szukanaLiczba = 7;

    for (int i = 0; i < liczby.length; i++) {
      if (liczby[i] == szukanaLiczba) {
        znaleziona = true;
        // znaleźliśmy liczbę - możemy więc przerwać pętlę
        break;
      }
    }

    if (znaleziona) {
      System.out.println("Liczba została znaleziona!");
    } else {
      System.out.println("Liczba nie została znaleziona.");
    }
  }
}
