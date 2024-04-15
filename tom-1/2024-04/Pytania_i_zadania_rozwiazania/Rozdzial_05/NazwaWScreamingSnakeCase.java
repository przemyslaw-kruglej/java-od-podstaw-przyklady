import java.util.Scanner;

public class NazwaWScreamingSnakeCase {
  public static void main(String[] args) {
    System.out.print("Podaj pierwsze słowo: ");
    String slowo1 = pobierzSlowo();

    System.out.print("Podaj drugie słowo: ");
    String slowo2 = pobierzSlowo();

    System.out.print("Podaj trzecie słowo: ");
    String slowo3 = pobierzSlowo();

    String nazwaWScreamingSnakeCase =
        slowo1.toUpperCase() + "_" +
        slowo2.toUpperCase() + "_" +
        slowo3.toUpperCase();

    System.out.printf("""
        Nazwa w konwencji SCREAMING_SNAKE_CASE \
        składające się ze słów:
        \t%s
        \t%s
        \t%s
        to: "%s"
        """,
        slowo1, slowo2, slowo3, nazwaWScreamingSnakeCase
    );
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
