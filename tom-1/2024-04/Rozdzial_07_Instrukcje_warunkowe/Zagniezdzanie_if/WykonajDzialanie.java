import java.util.Scanner;

public class WykonajDzialanie {
  public static void main(String[] args) {
    System.out.print("Podaj pierwszą liczbę: ");
    int liczba1 = pobierzLiczbe();

    System.out.print("Podaj drugą liczbę: ");
    int liczba2 = pobierzLiczbe();

    System.out.print(
        "Podaj operację do wykonania (+ - * /): "
    );
    String operacja = pobierzSlowo();

    int wynik = 0;
    boolean nieprawidlowaOperacja = false;

    if (operacja.equals("+")) {
      wynik = liczba1 + liczba2;
    } else if (operacja.equals("-")) {
      wynik = liczba1 - liczba2;
    } else if (operacja.equals("*")) {
      wynik = liczba1 * liczba2;
    } else if (operacja.equals("/")) {
      if (liczba2 != 0) {
        wynik = liczba1 / liczba2;
      } else {
        nieprawidlowaOperacja = true;
        System.out.println("Dzielnik nie może być zerem!");
      }
    } else {
      nieprawidlowaOperacja = true;
      System.out.println(
          "Nieprawidłowa operacja: " + operacja
      );
    }

    if (!nieprawidlowaOperacja) {
      System.out.printf(
          "%d %s %d = %d", liczba1, operacja, liczba2, wynik
      );
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
