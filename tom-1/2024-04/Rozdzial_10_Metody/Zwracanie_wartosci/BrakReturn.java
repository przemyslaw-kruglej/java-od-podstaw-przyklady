public class BrakReturn {
  public static void main(String[] args) {
    int liczbaDoKwadratu = kwadratLiczby(5);
  }

  public static int kwadratLiczby(int x) {
    int wynik = x * x;
    // zakomentuj poniższą linię aby zobaczyć,
    // jaki błąd zgłosi kompilator
    return wynik;
  }
}
