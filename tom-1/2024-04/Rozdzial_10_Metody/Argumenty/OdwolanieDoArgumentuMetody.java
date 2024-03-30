public class OdwolanieDoArgumentuMetody {
  public static void main(String[] args) {
    int wynik = policzPoleProstokata(10, 5);

    // odkomentuj poniższą instrukcję aby zobaczyć,
    // jak błąd zgłosi kompilator
    /*System.out.printf(
        "Pole prostokąta o bokach %d i %d wynosi %d",
        wynik,
        bokA,
        bokB
    );*/
  }

  public static int policzPoleProstokata(int bokA, int bokB) {
    return bokA * bokB;
  }
}
