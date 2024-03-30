public class LaczenieTekstuFormat {
  public static void main(String[] args) {
    int liczba1 = 42;
    int liczba2 = 7;
    int wynikMnozenia = liczba1 * liczba2;

    String komunikat = String.format(
        "Wynik mnożenia liczby %d i liczby %d wynosi %d",
        liczba1,
        liczba2,
        wynikMnozenia
    );

    System.out.println(komunikat);
  }
}
