public class LaczenieTekstuFormatted {
  public static void main(String[] args) {
    int liczba1 = 42;
    int liczba2 = 7;
    int wynikMnozenia = liczba1 * liczba2;

    String komunikat =
        "Wynik mnożenia %d i %d wynosi %d".formatted(
            liczba1,
            liczba2,
            wynikMnozenia
        );

    System.out.println(komunikat);
  }
}
