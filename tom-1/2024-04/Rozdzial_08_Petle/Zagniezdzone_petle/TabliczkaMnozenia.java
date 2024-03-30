public class TabliczkaMnozenia {
  public static void main(String[] args) {
    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {
        int wynik = i * j;

        if (wynik >= 10) {
          System.out.print(wynik + " ");
        } else {
          // dla jednocyfrowych wyników dodajemy spację
          // na początku, by wynik był ładnie sformatowany
          System.out.print(" " + wynik + " ");
        }
      }

      // pusta linia by oddzielić kolejne linie wartości
      System.out.println();
    }
  }
}
