public class ReturnWInstrukcjiIf {
  public static void main(String[] args) {
    double wynikDzielenia = podzielLiczby(100, 25);
  }

  public static double podzielLiczby(int x, int y) {
    // odkomentuj obie linijki aby zobaczyć,
    // jaki błąd zasygnalizuje kompilator
    // if (y != 0) {
      return x / y;
    // }
  }
}
