import java.time.LocalDate;
import java.util.Scanner;

public class CzyUzytkownikMaDzisiajUrodziny {
  public static void main(String[] args) {
    System.out.print("Podaj miesiąc urodzenia: ");
    int miesiac = pobierzLiczbe();

    System.out.print("Podaj dzień urodzenia: ");
    int dzien = pobierzLiczbe();

    if (czyDzisiajUrodziny(miesiac, dzien)) {
      System.out.println("Sto lat!");
    } else {
      System.out.println("Nie masz dzisiaj urodzin.");
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static boolean czyDzisiajUrodziny(
      int miesiacUrodzin, int dzienUrodzin
  ) {
    LocalDate aktualnaData = LocalDate.now();

    int aktualnyMiesiac = aktualnaData.getMonthValue();
    int aktualnyDzien = aktualnaData.getDayOfMonth();

    return miesiacUrodzin == aktualnyMiesiac &&
        dzienUrodzin == aktualnyDzien;
  }
}
