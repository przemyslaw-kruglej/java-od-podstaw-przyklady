public class NiejasneWywolanieMetody {
  public static void main(String[] args) {
    // wypisz(null);
    // ^ błąd kompilacji - odkomentuj powyższą linię
    // aby zobaczyć, jaki błąd zgłosi kompilator

    wypisz(new int[] { 7, 13, 42 });

    // ok - wiadomo, o wywołanie której metody chodzi,
    // chociaż program zakończy się błędem NullPointerException,
    // ponieważ w metodzie wypisz nie sprawdzamy, czy przekazana
    // jako argument tablica jest != null
    int[] nullTablica = null;
    wypisz(nullTablica);
  }

  public static void wypisz(int[] liczby) {
    for (int liczba : liczby) {
      System.out.println(liczba);
    }
  }

  public static void wypisz(double[] liczby) {
    for (double liczba : liczby) {
      System.out.println(liczba);
    }
  }

  public static void wypisz(String komunikat) {
    System.out.println("Treść komunikatu: " + komunikat);
  }
}
