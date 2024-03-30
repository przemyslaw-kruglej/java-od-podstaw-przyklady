import java.util.Scanner;

public class RezultatMetodyZlozoneWyrazenie {
  public static void main(String[] args) {
    System.out.print("Podaj rok: ");
    int rok = pobierzLiczbe();

    int liczbaGodzinWRoku =
        24 * (czyPrzestepny(rok) ? 366 : 365);

    System.out.printf(
        "W podanym roku było %d godzin.", liczbaGodzinWRoku
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static boolean czyPrzestepny(int rok) {
    return
        (rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0;
  }
}
