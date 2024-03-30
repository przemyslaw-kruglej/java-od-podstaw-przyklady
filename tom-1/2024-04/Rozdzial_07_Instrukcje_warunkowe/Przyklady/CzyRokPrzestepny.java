import java.util.Scanner;

public class CzyRokPrzestepny {
  public static void main(String[] args) {
    System.out.print("Podaj rok: ");
    int rok = pobierzLiczbe();

    if (rok < 1) {
      System.out.println("Nieprawidłowy rok.");
    } else {
      boolean czyPrzestepny =
          (rok % 4 == 0 && rok % 100 != 0) ||
          rok % 400 == 0;

      if (czyPrzestepny) {
        System.out.println("Jest to rok przestępny.");
      } else {
        System.out.println("Nie jest to rok przestępny.");
      }
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
