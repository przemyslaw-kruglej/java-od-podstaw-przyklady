public class NajwiekszaWartoscWTablicy {
  public static void main(String[] args) {
    int[] liczby = { 1, -20, 100, 40, -15 };

    int najwiekszaLiczba = liczby[0];

    for (int i = 1; i < liczby.length; i++) {
      if (liczby[i] > najwiekszaLiczba) {
        najwiekszaLiczba = liczby[i];
      }
    }

    System.out.println(
        "Największa liczba to: " + najwiekszaLiczba
    );
  }
}