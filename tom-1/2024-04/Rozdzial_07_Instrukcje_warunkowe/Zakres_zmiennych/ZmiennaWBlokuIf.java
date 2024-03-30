public class ZmiennaWBlokuIf {
  public static void main(String[] args) {
    int licznik = 9;
    int mianownik = 3;

    if (mianownik != 0) {
      double wynik = licznik / mianownik;
    }

    // błąd - w tym miejscu zmienna wynik już nie istnieje
    // System.out.println("Wynik = " + wynik);
  }
}
