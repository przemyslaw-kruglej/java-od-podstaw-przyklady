public class ZmianaWartosciArgumentuTypuPrymitywnego {
  public static void main(String[] args) {
    int liczba = 5;

    System.out.println(
        "Przed wywołaniem zmienna liczba ma wartość: " + liczba
    );
    System.out.println(
        "Wynik wywołania metody: " + podniesDoPotegi(liczba)
    );
    System.out.println(
        "Po wywołaniu zmienna liczba ma wartość: " + liczba
    );
  }

  public static int podniesDoPotegi(int arg) {
    arg = 10;
    return arg * arg;
  }
}
