public class NajczestszaLiczbaWTablicy {
  public static void main(String[] args) {
    System.out.println(
        najczesciejWystepujacaLiczba(new int[] { 1, 1, 1 })
    );
    System.out.println(
        najczesciejWystepujacaLiczba(new int[] { 1, 2, 2 })
    );
    System.out.println(
        najczesciejWystepujacaLiczba(new int[] { 1 })
    );
    System.out.println(
        najczesciejWystepujacaLiczba(new int[] { 1, 2 })
    );
    System.out.println(
        najczesciejWystepujacaLiczba(
            new int[] { 1, 2, 2, 2 }
        )
    );
    System.out.println(
        najczesciejWystepujacaLiczba(
            new int[] { 1, 2, 2, 2, 3, 3, 3, 3 }
        )
    );
  }

  /**
   * Zwraca liczbę, która występuje najwięcej razy
   * w podanej tablicy, która powinna być posortowana
   * niemalejąco. Jeżeli więcej niż jedna liczba
   * występuje najwięcej razy, to zostanie zwrócona
   * pierwsza z nich. Dla nieposortowanej tablicy
   * wynik jest niezdefiniowany.
   *
   * @param liczby  niepusta i nienullowa tablica
   *                wartości posortowanych niemalejąco
   * @return        najczęściej występująca liczba
   *                w przekazanej tablicy
   */
  public static int najczesciejWystepujacaLiczba(
      int[] liczby
  ) {
    int najczesciejWystepujacaLiczba = liczby[0];
    int aktualnaLiczba = liczby[0];
    int ileRazyWystapilaNajczestszaDoTejPory = 1;
    int aktualnaIleRazyWystapila = 1;

    for (int i = 1; i < liczby.length; i++) {
      if (liczby[i] == aktualnaLiczba) {
        aktualnaIleRazyWystapila++;
      }
      if (
          liczby[i] != aktualnaLiczba ||
          i == liczby.length - 1
      ) {
        if (
            aktualnaIleRazyWystapila >
            ileRazyWystapilaNajczestszaDoTejPory
        ) {
          najczesciejWystepujacaLiczba =
              aktualnaLiczba;

          ileRazyWystapilaNajczestszaDoTejPory =
              aktualnaIleRazyWystapila;

          aktualnaIleRazyWystapila = 1;
        }
        aktualnaLiczba = liczby[i];
      }
    }

    return najczesciejWystepujacaLiczba;
  }
}
