import java.util.Scanner;

public class WiekszaLiczba {
  public static void main(String[] args) {
    System.out.print("Podaj pierwszą liczbę: ");
    int a = pobierzLiczbe();

    System.out.print("Podaj drugą liczbę: ");
    int b = pobierzLiczbe();

    System.out.println(
        "Większa liczba to " + Math.max(a, b)
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
