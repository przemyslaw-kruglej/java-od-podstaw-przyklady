import java.util.Arrays;

public class IleUnikalnychLiczbSortowanie {
  public static void main(String[] args) {
    int[] liczby = { 5, 10, 5, 15, -100, 10, 10, 15 };

    Arrays.sort(liczby);

    int ileUnikalnych = 0;

    for (int i = 0; i < liczby.length; i++) {
      if (i == 0 || liczby[i] != liczby[i - 1]) {
        ileUnikalnych++;
      }
    }

    System.out.println(
        "Liczba unikalnych wartości: " + ileUnikalnych
    );
  }
}
