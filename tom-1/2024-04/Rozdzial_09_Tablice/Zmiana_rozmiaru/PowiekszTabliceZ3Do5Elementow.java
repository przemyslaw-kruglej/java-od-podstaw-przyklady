public class PowiekszTabliceZ3Do5Elementow {
  public static void main(String[] args) {
    int[] liczby = { 7, 13, 42 };

    System.out.println(
        "Długość tablicy liczby: " + liczby.length
    );

    // nowa tablica ma mieć o 2 elementy więcej
    int[] tymczasowaTablica = new int[liczby.length + 2];

    for (int i = 0; i < liczby.length; i++) {
      tymczasowaTablica[i] = liczby[i];
    }

    liczby = tymczasowaTablica;

    System.out.println(
        "Długość tablicy liczby: " + liczby.length
    );

    System.out.println(
        "Tablica liczby zawiera teraz elementy: "
    );
    for (int liczba : liczby) {
      System.out.print(liczba + " ");
    }
  }
}
