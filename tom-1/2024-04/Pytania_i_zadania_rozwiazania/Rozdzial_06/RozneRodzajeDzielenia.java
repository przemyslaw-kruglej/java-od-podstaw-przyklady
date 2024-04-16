import java.util.Scanner;

public class RozneRodzajeDzielenia {
  public static void main(String[] args) {
    System.out.print("Podaj pierwszą liczbę: ");
    int x = pobierzLiczbe();

    System.out.print("Podaj drugą liczbę: ");
    int y = pobierzLiczbe();

    double wynikZmiennoprzecinkowy = (double) x / y;

    int resztaZDzielenia = x % y;

    double zaokragloneDzielenie =
        Math.ceil((double) x / y);

    System.out.println(
        "Wynik dzielenia zmiennoprzecinkowego: " +
        wynikZmiennoprzecinkowy
    );

    System.out.println(
        "Reszta z dzielenia: " + resztaZDzielenia
    );

    System.out.println(
        "Wynik dzielenia zaokrąglony w górę: " +
        zaokragloneDzielenie
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
