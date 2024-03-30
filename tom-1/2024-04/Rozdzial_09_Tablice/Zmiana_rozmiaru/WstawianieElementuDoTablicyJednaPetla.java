public class WstawianieElementuDoTablicyJednaPetla {
  public static void main(String[] args) {
    int[] liczby = { -42, 77, 100, 5, 10, 15 };

    int wartoscDoWstawienia = 999;
    int gdzieWstawic = 3;

    int[] powiekszoneLiczby = new int[liczby.length + 1];

    for (int i = 0; i < liczby.length; i++) {
      if (i < gdzieWstawic) {
        powiekszoneLiczby[i] = liczby[i];
      } else if (i == gdzieWstawic) {
        powiekszoneLiczby[i] = wartoscDoWstawienia;
      } else {
        powiekszoneLiczby[i + 1] = liczby[i];
      }
    }

    liczby = powiekszoneLiczby;

    System.out.println("Tablica liczby zawiera elementy:");
    for (int liczba : liczby) {
      System.out.print(liczba + " ");
    }
  }
}
