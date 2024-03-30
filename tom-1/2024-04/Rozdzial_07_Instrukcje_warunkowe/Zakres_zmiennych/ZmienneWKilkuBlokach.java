public class ZmienneWKilkuBlokach {
  public static void main(String[] args) {
    int liczba = 1;

    if (liczba > 0) {
      int drugaLiczba = 10;
      // dostęp do: liczba, drugaLiczba

      if (drugaLiczba > 5) {
        int trzeciaLiczba = 25;
        // dostęp do: liczba, drugaLiczba, trzeciaLiczba
      }

      // dostęp do: liczba, drugaLiczba
    } else {
      // dostęp do: liczba
    }

    // dostęp do: liczba
  }
}
