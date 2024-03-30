public class SumowanieLiczbRekurencyjnie {
  public static void main(String[] args) {
    System.out.println(
        "Suma liczb od 0 do 5 wynosi: " + sumuj(5)
    );
  }

  public static int sumuj(int n) {
    if (n == 0) {
      return 0;
    } else {
      return sumuj(n - 1) + n;
    }
  }
}
