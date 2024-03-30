public class PrzypisanieTablicyDoStalejTablicowej {
  public static void main(String[] args) {
    int[] liczby = { 10, 100, -42, 7, 15 };
    final int[] inneLiczby = { 5, 10, 15 };

    // ok - zmienna liczby będzie pokazywać teraz
    // na inną tablicę
    liczby = new int[] { -1, 88, 99, 42, 77 };

    // błąd kompilacji - zmienna inneLiczby nie może
    // pokazywać na inną tablicę
    // inneLiczby = new int[] { 100, 200, 300, 400, 500 };
  }
}
