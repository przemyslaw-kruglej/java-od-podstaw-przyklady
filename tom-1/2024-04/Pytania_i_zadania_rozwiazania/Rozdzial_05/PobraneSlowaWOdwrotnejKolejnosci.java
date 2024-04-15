import java.util.Scanner;

public class PobraneSlowaWOdwrotnejKolejnosci {
  public static void main(String[] args) {
    System.out.print("Podaj pierwsze słowo: ");
    String slowo1 = pobierzSlowo();

    System.out.print("Podaj drugie słowo: ");
    String slowo2 = pobierzSlowo();

    System.out.print("Podaj trzecie słowo: ");
    String slowo3 = pobierzSlowo();

    System.out.printf(
        "%s, %s, %s", slowo3, slowo2, slowo1
    );
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
