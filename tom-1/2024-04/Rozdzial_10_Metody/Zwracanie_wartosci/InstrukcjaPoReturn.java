public class InstrukcjaPoReturn {
  public static void main(String[] args) {
    int kwadrat = podniesDoKwadratu(10);
  }

  public static int podniesDoKwadratu(int x) {
    return x * x;

    // linia po return nie ma szansy się wykonać
    // odkomentuj poniższą linię aby zobaczyć,
    // jaki komunikat błędu zwróci kompilator
    // System.out.println("Instrukcja po return!");
  }
}
