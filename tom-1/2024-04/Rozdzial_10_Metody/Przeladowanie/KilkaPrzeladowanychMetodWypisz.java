public class KilkaPrzeladowanychMetodWypisz {
  public static void main(String[] args) {
    wypisz(77);
    wypisz(3.14);
    wypisz("Ala ma kota.");
    wypisz(new int[] { 1, 5, 8 });
  }

  public static void wypisz(int liczba) {
    System.out.println("Liczba całkowita: " + liczba);
  }

  public static void wypisz(double liczba) {
    System.out.println("Liczba rzeczywista: " + liczba);
  }

  public static void wypisz(String komunikat) {
    System.out.println(komunikat);
  }

  public static void wypisz(int[] tablica) {
    for (int i = 0; i < tablica.length; i++) {
      System.out.printf(
          "Element tablicy #%d: %s\n", i + 1, tablica[i]
      );
    }
  }
}
