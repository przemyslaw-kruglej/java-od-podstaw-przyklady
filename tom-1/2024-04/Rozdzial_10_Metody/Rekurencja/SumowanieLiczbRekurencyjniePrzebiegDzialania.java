public class SumowanieLiczbRekurencyjniePrzebiegDzialania {
  public static void main(String[] args) {
    System.out.println(
        "Suma liczb od 0 do 5 wynosi: " + sumuj(5)
    );
  }

  public static int sumuj(int n) {
    System.out.println("sumuj wywołane z argumentem: " + n);

    if (n == 0) {
      System.out.println("Dla argumentu 0 zwracam 0");
      return 0;
    } else {
      System.out.println(
          "Wywołuję sumuj z argumentem " + (n - 1)
      );

      int wynik = sumuj(n - 1);

      System.out.printf(
          "Po wywołaniu sumuj z arg. %d otrzymałem wynik %d\n",
          n - 1,
          wynik
      );
      System.out.printf(
          "Teraz zwrócę wartość: %d + %d = %d\n",
          wynik,
          n,
          wynik + n
      );

      return wynik + n;
    }
  }
}
