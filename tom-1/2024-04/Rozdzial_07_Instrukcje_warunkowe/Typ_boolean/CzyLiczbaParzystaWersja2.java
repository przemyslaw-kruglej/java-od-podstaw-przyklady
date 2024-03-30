import java.util.Scanner;

public class CzyLiczbaParzystaWersja2 {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę: ");
    int liczba = pobierzLiczbe();

    boolean czyParzysta = liczba % 2 == 0;

    System.out.println(
        "Czy liczba parzysta? " + czyParzysta
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
