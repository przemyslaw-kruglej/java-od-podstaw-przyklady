public class ZmiennaLokalnaWInnejMetodzie {
  public static void main(String[] args) {
    double wynik = policzPoleKola(5);

    // odkomentuj poniższą linię aby zobaczyć,
    // błąd zgłosi kompilator
    System.out.println(
    //    "Promień do kwadratu to: " + promienDoKwadratu
    );
  }

  public static double policzPoleKola(double promien) {
    double promienDoKwadratu = promien * promien;

    return Math.PI * promienDoKwadratu;
  }
}
