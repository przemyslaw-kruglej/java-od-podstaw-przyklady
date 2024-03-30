public class FormatowanieZaPomocaPrintf {
  public static void main(String[] args) {
    int liczba1 = 42;
    int liczba2 = 7;
    int wynikMnozenia = liczba1 * liczba2;

    System.out.printf(
        "Wynik mnożenia liczby %d i liczby %d wynosi %d\n",
        liczba1,
        liczba2,
        wynikMnozenia
    );

    float liczbaPi = 3.14f;

    System.out.printf(
        "Liczba Pi to w przybliżeniu %f", liczbaPi
    );
  }
}
