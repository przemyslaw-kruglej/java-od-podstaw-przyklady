public class ZagadkaKonkatenacja {
  public static void main(String[] args) {
    System.out.println("10 + 2 to: " + 10 + 2);
    System.out.println("10 + 2 to: " + (10 + 2));
    System.out.println(
        10 + 2 + " to wynik dodawania 10 + 2"
    );

    // błąd - operator minus działa na liczbach, natomiast
    // w poniższej linii najpierw liczba 10
    // zostanie dołączona do stringa "10 - 2 to: ",
    // a potem ten string będzie jednym z argumentów
    // operatora odejmowania - taki zapis powoduje błąd kompilacji
    // System.out.println("10 - 2 to: " + 10 - 2);
    System.out.println("10 - 2 to: " + (10 - 2));
    System.out.println(
        10 - 2 + " to wynik odejmowania 10 - 2"
    );
  }
}
