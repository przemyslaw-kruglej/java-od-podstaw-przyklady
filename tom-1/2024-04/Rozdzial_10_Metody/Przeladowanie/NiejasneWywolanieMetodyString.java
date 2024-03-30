public class NiejasneWywolanieMetodyString {
  public static void main(String[] args) {
    // błąd kompilacji – nie wiadomo, o wywołanie której
    // metody chodzi
    // wypisz(null);
    // odkomentuj powyższą linię aby zobaczyć,
    // jaki błąd zgłosi kompilator
  }

  public static void wypisz(int[] liczby) {
    for (int liczba : liczby) {
      System.out.println(liczba);
    }
  }

  public static void wypisz(String komunikat) {
    System.out.println("Treść komunikatu: " + komunikat);
  }
}
