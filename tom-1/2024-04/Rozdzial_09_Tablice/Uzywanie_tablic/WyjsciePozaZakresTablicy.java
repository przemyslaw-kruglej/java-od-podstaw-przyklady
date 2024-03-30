public class WyjsciePozaZakresTablicy {
  public static void main(String[] args) {
    int[] tablica = { 10, -20, 5 };

    // element o indeksie 3 nie istnieje!
    // ostatni (trzeci) element tablicy ma indeks 2
    // kod się skompiluje, ale w trakcie działania
    // programu pojawi sie błąd ArrayIndexOutOfBoundsException
    System.out.println(tablica[3]);
  }
}