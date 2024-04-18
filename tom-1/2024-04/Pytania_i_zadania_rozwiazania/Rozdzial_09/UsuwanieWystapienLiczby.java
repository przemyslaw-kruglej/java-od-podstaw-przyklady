import java.util.Arrays;

public class UsuwanieWystapienLiczby {
  public static void main(String[] args) {
    int[] liczby = { 10, 5, 99, 100, 10, -42, 10 };
    int liczbaDoUsuniecia = 10;

    int[] tymczasowaTablica = new int[liczby.length];

    int indeksWTymczasowej = 0;
    for (int i = 0; i < liczby.length; i++) {
      if (liczby[i] != liczbaDoUsuniecia) {
        tymczasowaTablica[indeksWTymczasowej++] = liczby[i];
      }
    }

    liczby = Arrays.copyOfRange(
        tymczasowaTablica, 0, indeksWTymczasowej
    );

    System.out.printf(
        "Zawartość tablicy po usunięciu liczby %d: %s",
        liczbaDoUsuniecia, Arrays.toString(liczby)
    );
  }
}
