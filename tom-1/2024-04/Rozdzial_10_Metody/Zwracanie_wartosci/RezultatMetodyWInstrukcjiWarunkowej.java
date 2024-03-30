import java.util.Scanner;

public class RezultatMetodyWInstrukcjiWarunkowej {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę: ");
    int podanaLiczba = pobierzLiczbe();

    if (czyParzysta(podanaLiczba)) {
      System.out.println("To liczba parzysta.");
    } else {
      System.out.println("To liczba nieparzysta.");
    }

    System.out.print("Podaj kolejną liczbę: ");

    if (pobierzLiczbe() >= 0) {
      System.out.println("Ta liczba jest nieujemna.");
    } else {
      System.out.println("Ta liczba jest ujemna.");
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static boolean czyParzysta(int liczba) {
    return liczba % 2 == 0;
  }
}
