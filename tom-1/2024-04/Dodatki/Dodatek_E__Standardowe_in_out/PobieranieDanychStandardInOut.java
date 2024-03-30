import java.util.Scanner;

public class PobieranieDanychStandardInOut {
  private static final Scanner scanner =
      new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Podaj liczbę: ");
    int liczba = pobierzLiczbe();

    System.out.print("Podaj słowo: ");
    String slowo = pobierzSlowo();

    System.out.printf(
        "Podałeś liczbę %d oraz słowo %s", liczba, slowo
    );
  }

  public static int pobierzLiczbe() {
    return scanner.nextInt();
  }

  public static String pobierzSlowo() {
    return scanner.next();
  }
}
