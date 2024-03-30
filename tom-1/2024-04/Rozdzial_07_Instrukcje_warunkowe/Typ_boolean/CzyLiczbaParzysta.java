import java.util.Scanner;

public class CzyLiczbaParzysta {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę: ");
    int liczba = pobierzLiczbe();

    boolean czyParzysta;

    if (liczba % 2 == 0) {
      czyParzysta = true;
    } else {
      czyParzysta = false;
    }

    System.out.println(
        "Czy liczba parzysta? " + czyParzysta
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
