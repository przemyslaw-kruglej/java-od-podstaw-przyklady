public class RezultatMetodyPrzypisanyDoZmiennej {
  public static void main(String[] args) {
    int kwadrat = podniesDoKwadratu(16);

    // ok - do zmiennej typu double możemy przypisać
    // wartość int zwracaną z metody podniesDoKwadratu
    double tezKwadrat = podniesDoKwadratu(100);

    // linijka zakomentowana, bo spowodowałaby
    // błąd kompilacji - nie możemy przypisać
    // zwracanej wartości int do zmiennej typu String
    // String tekst = podniesDoKwadratu(16);
  }

  public static int podniesDoKwadratu(int liczba) {
    return liczba * liczba;
  }
}