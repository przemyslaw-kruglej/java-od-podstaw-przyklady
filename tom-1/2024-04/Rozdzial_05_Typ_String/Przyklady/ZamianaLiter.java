import java.util.Scanner;

public class ZamianaLiter {
  public static void main(String[] args) {
    System.out.print("Podaj słowo: ");
    String slowo = pobierzSlowo();

    System.out.print("Podaj fragment do zamiany: ");
    String doZamiany = pobierzSlowo();

    System.out.print("Podaj na co zamienić ten fragment: ");
    String zamienicNa = pobierzSlowo();

    String poZamianie =
        slowo.replace(doZamiany, zamienicNa);

    System.out.printf(
        "Wynik zamiany '%s' na '%s' w słowie '%s': %s",
        doZamiany,
        zamienicNa,
        slowo,
        poZamianie
    );
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
