public class UdokumentowanaSumaLiczbWersja1 {
  public static void main(String[] args) {
    int[] liczby = { 1, 10, 100, 1000 };
    System.out.println("Suma liczba: " + sumuj(liczby));
  }

  /**
   * Zwraca sumę liczb zawartą w przekazanej tablicy.
   * Założenie: przekazana tablica nie jest nullem.
   * W przeciwnym razie działanie metody zakończy się
   * błędem NullPointerException.
   *
   * @param liczby  tablica z elementami do podsumowania,
   *                powinna nie być nullem.
   * @return        suma elementów przekazanej tablicy
   */
  public static int sumuj(int[] liczby) {
    int suma = 0;

    for (int liczba : liczby) {
      suma += liczba;
    }
    return suma;
  }
}
