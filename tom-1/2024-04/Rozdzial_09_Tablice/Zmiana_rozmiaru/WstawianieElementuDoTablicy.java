public class WstawianieElementuDoTablicy {
  public static void main(String[] args) {
    int[] liczby = { -42, 77, 100, 5, 10, 15 };

    int wartoscDoWstawienia = 999;
    int gdzieWstawic = 3;

    int[] powiekszoneLiczby = new int[liczby.length + 1];

    for (int i = 0; i < gdzieWstawic; i++) {
      powiekszoneLiczby[i] = liczby[i];
    }

    powiekszoneLiczby[gdzieWstawic] = wartoscDoWstawienia;

    for (int i = gdzieWstawic; i < liczby.length; i++) {
      powiekszoneLiczby[i + 1] = liczby[i];
    }

    liczby = powiekszoneLiczby;

    System.out.println("Tablica liczby zawiera elementy:");
    for (int liczba : liczby) {
      System.out.print(liczba + " ");
    }
  }
}
