public class PrzeladowanieZwracanyTyp {
  public static void main(String[] args) {
    podziel(100, 9);
  }

  public static int podziel(int a, int b) {
    return a / b;
  }

  // odkomentuj poniższą metodę aby zobaczyć
  // jaki błąd zwróci kompilator
  /*public static double podziel(int a, int b) {
    return (double) a / b;
  }*/
}
