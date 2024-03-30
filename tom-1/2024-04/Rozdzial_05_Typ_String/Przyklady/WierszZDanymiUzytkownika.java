import java.util.Scanner;

public class WierszZDanymiUzytkownika {
  public static void main(String[] args) {
    System.out.println(
        "Podaj cztery słowa, a umieszczę je w wierszu:"
    );
    String slowo1 = pobierzSlowo();
    String slowo2 = pobierzSlowo();
    String slowo3 = pobierzSlowo();
    String slowo4 = pobierzSlowo();

    String wiersz = """
        Na górze %s,
        na dole %s.
        Znów jest %s,
        więc teraz %s.
    """;

    System.out.println("\nA oto i wiersz:\n");
    System.out.printf(
        wiersz, slowo1, slowo2, slowo3, slowo4
    );
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
