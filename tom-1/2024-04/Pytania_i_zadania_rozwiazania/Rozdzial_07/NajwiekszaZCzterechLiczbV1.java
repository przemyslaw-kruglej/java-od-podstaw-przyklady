import java.util.Scanner;

public class NajwiekszaZCzterechLiczbV1 {
  public static void main(String[] args) {
    System.out.println("Podaj cztery liczby:");
    int a = pobierzLiczbe();
    int b = pobierzLiczbe();
    int c = pobierzLiczbe();
    int d = pobierzLiczbe();

    if (a > b && a > c && a > d) {
      System.out.println("Największa liczba to: " + a);
    } else if (b > c && b > d) {
      System.out.println("Największa liczba to: " + b);
    } else if (c > d) {
      System.out.println("Największa liczba to: " + c);
    } else {
      System.out.println("Największa liczba to: " + d);
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
