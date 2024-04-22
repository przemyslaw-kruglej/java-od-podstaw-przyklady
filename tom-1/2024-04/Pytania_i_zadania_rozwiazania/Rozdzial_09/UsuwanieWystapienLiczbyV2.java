import java.util.Arrays;

public class UsuwanieWystapienLiczbyV2 {
  public static void main(String[] args) {
    int[] liczby = { 10, 5, 99, 100, 10, -42, 10 };
    int liczbaDoUsuniecia = 10;

    int ileDoUsuniecia = 0;
    for (int liczba : liczby) {
      if (liczba == liczbaDoUsuniecia) {
        ileDoUsuniecia++;
      }
    }

    int[] tymczasowaTablica =
        new int[liczby.length - ileDoUsuniecia];

    int indeksWTymczasowej = 0;
    for (int liczba : liczby) {
      if (liczba != liczbaDoUsuniecia) {
        tymczasowaTablica[indeksWTymczasowej++] = liczba;
      }
    }

    liczby = tymczasowaTablica;

    System.out.printf(
        "Zawartość tablicy po usunięciu liczby %d: %s",
        liczbaDoUsuniecia, Arrays.toString(liczby)
    );
  }
}
