public class WypiszElementyTablicyWyjsciePozaZakres {
  public static void main(String[] args) {
    int[] liczby = { -5, 100, 1, 0, 20 };

    // błąd - zmienna i wyjdzie poza zakres
    // indesków zmiennej liczby - powinien zostać
    // użyty operatora < zamiast <=
    for (int i = 0; i <= liczby.length; i++) {
      System.out.print(liczby[i] + " ");
    }
  }
}
