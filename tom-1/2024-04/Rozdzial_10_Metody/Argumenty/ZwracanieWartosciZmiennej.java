public class ZwracanieWartosciZmiennej {
  public static void main(String[] args) {
    System.out.println(
        "5 do kwadratu to " + podniesDoKwadratu(5)
    );
  }

  public static int podniesDoKwadratu(int x) {
    int wynik = x * x;
    return wynik;
  }
}
