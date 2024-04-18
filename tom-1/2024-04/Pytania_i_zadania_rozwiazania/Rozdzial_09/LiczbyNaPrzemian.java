import java.util.Arrays;

public class LiczbyNaPrzemian {
  public static void main(String[] args) {
    int[] liczby = { 10, 1, 7, 13, 42 };
    int dlugosc = liczby.length;

    Arrays.sort(liczby);
    int[] tymczasowaTablica = new int[dlugosc];

    for (int i = 0, j = 0; i < dlugosc / 2; i++, j += 2) {
      tymczasowaTablica[j] = liczby[i];
      tymczasowaTablica[j + 1] =
          liczby[dlugosc - i - 1];
    }

    if (dlugosc % 2 == 1) {
      tymczasowaTablica[dlugosc - 1] = liczby[dlugosc / 2];
    }

    liczby = tymczasowaTablica;

    System.out.println(
        "Zawartość tablicy liczby: " +
        Arrays.toString(liczby)
    );
  }
}
