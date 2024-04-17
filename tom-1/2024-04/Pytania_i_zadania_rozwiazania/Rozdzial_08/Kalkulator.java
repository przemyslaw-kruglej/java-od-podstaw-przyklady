import java.util.Scanner;

public class Kalkulator {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę: ");
    int poprzedniWynik = pobierzLiczbe();

    boolean czyBlednaOperacja;

    do {
      int nowyWynik = 0;
      czyBlednaOperacja = false;

      System.out.print("Podaj działanie (* / - +): ");
      String dzialanie = pobierzSlowo();

      System.out.print("Podaj kolejną liczbę: ");
      int drugaLiczba = pobierzLiczbe();

      switch (dzialanie) {
        case "+" -> nowyWynik = poprzedniWynik + drugaLiczba;
        case "-" -> nowyWynik = poprzedniWynik - drugaLiczba;
        case "*" -> nowyWynik = poprzedniWynik * drugaLiczba;
        case "/" -> {
          if (drugaLiczba == 0) {
            czyBlednaOperacja = true;
            System.out.println("Nie można dzielić przez 0.");
          } else {
            nowyWynik = poprzedniWynik / drugaLiczba;
          }
        }
        default -> {
          czyBlednaOperacja = true;
          System.out.println(
              "Nieprawidłowa operacja: " + dzialanie
          );
        }
      }

      if (!czyBlednaOperacja) {
        System.out.printf(
            "%d %s %d = %d\n",
            poprzedniWynik,
            dzialanie,
            drugaLiczba,
            nowyWynik
        );

        poprzedniWynik = nowyWynik;
      }

      System.out.print(
          "\nCzy chcesz zakończyć program? [t/n] "
      );
    } while (!"t".equalsIgnoreCase(pobierzSlowo()));
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}