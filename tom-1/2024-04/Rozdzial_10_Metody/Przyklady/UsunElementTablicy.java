import java.util.Arrays;

public class UsunElementTablicy {
  public static void main(String[] args) {
    int[] liczby = { 7, 13, 42, 77, 99 };

    // nieprawidłowe argumenty:
    // null tablica lub indeks elementu
    // do usunięcia spoza zakresu elementów tablicy
    System.out.println(
        Arrays.toString(usunElement(null, 0))
    );
    System.out.println(
        Arrays.toString(usunElement(liczby, -5))
    );
    System.out.println(
        Arrays.toString(usunElement(liczby, 10))
    );

    System.out.println(
        Arrays.toString(usunElement(liczby, 0))
    );
    System.out.println(
        Arrays.toString(usunElement(liczby, 2))
    );
    System.out.println(
        Arrays.toString(usunElement(liczby, 4))
    );
  }

  public static int[] usunElement(
      int[] tab, int indeksElementuDoUsuniecia
  ) {
    if (tab == null) {
      return new int[0];
    } else if (
        indeksElementuDoUsuniecia < 0 ||
        indeksElementuDoUsuniecia > tab.length - 1
    ) {
      return Arrays.copyOf(tab, tab.length);
    }

    int[] kopiaBezJednegoElementu = new int[tab.length - 1];

    for (int i = 0; i < tab.length; i++) {
      if (i < indeksElementuDoUsuniecia) {
        kopiaBezJednegoElementu[i] = tab[i];
      } else if (i > indeksElementuDoUsuniecia) {
        kopiaBezJednegoElementu[i - 1] = tab[i];
      }
    }

    return kopiaBezJednegoElementu;
  }
}
