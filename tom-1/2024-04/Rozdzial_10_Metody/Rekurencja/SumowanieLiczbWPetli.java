public class SumowanieLiczbWPetli {
  public static void main(String[] args) {
    System.out.println(
        "Suma liczb od 0 do 5 wynosi: " + sumuj(5)
    );
  }

  public static int sumuj(int n) {
    int suma = 0;

    for (int i = 0; i <= n; i++) {
      suma += i;
    }

    return suma;
  }
}
