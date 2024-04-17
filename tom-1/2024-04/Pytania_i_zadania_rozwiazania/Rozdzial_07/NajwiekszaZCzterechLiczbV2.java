import java.util.Scanner;

public class NajwiekszaZCzterechLiczbV2 {
  public static void main(String[] args) {
    System.out.println("Podaj cztery liczby:");
    int a = pobierzLiczbe();
    int b = pobierzLiczbe();
    int c = pobierzLiczbe();
    int d = pobierzLiczbe();

    System.out.println(
        "Największa liczba to: " +
        Math.max(Math.max(a, b), Math.max(c, d))
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
