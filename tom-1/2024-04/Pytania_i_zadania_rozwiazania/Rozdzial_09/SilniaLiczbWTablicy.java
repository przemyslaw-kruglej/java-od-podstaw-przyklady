import java.util.Scanner;

public class SilniaLiczbWTablicy {
  public static void main(String[] args) {
    int[] liczby = new int[5];

    System.out.println("Podaj pięć liczb naturalnych.");

    int indeks = 0;
    while (indeks < liczby.length) {
      System.out.printf("Liczba #%d: ", indeks + 1);
      liczby[indeks] = pobierzLiczbe();

      if (liczby[indeks] < 0) {
        System.out.println(
            "Nieprawidłowa liczba naturalna."
        );
      } else {
        indeks++;
      }
    }

    for (int x : liczby) {
      int silnia = 1;

      for (int i = 1; i <= x; i++) {
        silnia *= i;
      }

      System.out.printf(
          "Silnia liczby %d wynosi %d.\n", x, silnia
      );
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}