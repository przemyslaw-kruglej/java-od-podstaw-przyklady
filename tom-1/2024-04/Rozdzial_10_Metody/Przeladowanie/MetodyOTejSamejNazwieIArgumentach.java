public class MetodyOTejSamejNazwieIArgumentach {
  public static void main(String[] args) {
    wypisz(77);
    wypisz(100);
  }

  public static void wypisz(int liczba) {
    System.out.println(
        "Argument liczba ma wartość: " + liczba
    );
  }

  // odkomentuj poniższą metodę aby zobaczyć,
  // jaki błąd zgłosi kompilator
  /*public static void wypisz(int wartosc) {
    System.out.println("Przekazana wartość: " + wartosc);
  }*/
}
