public class SumujArgumenty {
  public static void main(String[] args) {
    if (
        args.length == 0 ||
        "--help".equalsIgnoreCase(args[0])
    ) {
      wyswietlPomoc();
    } else {
      System.out.println(sumuj(args));
    }
  }

  public static void wyswietlPomoc() {
    System.out.println("""
        Program sumujący liczby podane jako argumenty.
        Uwaga: program zakłada, że przekazane wartości
               są poprawnymi liczbami. W przeciwnym razie
               działanie programu zakończy się błędem.

        Użycie: ZliczWartosciArgumentow 10 100 5 -2

        Argumenty:
          --help        wyświetla informacje o programie
          A B .. Y Z    liczby do podsumowania
        """);
  }

  public static int sumuj(String[] liczbyJakoTekst) {
    int suma = 0;

    for (String liczbaJakoTekst : liczbyJakoTekst) {
      suma += Integer.parseInt(liczbaJakoTekst);
    }

    return suma;
  }
}
