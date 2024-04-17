import java.util.Scanner;

public class PoliczSilnie {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę nieujemną: ");
    int liczba = pobierzLiczbe();

    if (liczba < 0) {
      System.out.println("Oczekiwałem liczby nieujemnej.");
    } else {
      int silnia = 1;

      for (int i = 1; i <= liczba; i++) {
        silnia = silnia * i;
      }

      System.out.printf(
          "Silnia liczby %d to %d.", liczba, silnia
      );
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}