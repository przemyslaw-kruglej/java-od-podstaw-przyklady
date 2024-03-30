import java.util.Scanner;

public class CamelCaseZDwochSlow {
  public static void main(String[] args) {
    System.out.print("Podaj pierwsze słowo: ");
    String s1 = pobierzSlowo();

    System.out.print("Podaj drugie słowo: ");
    String s2 = pobierzSlowo();

    String nazwaWCamelCase =
        s1.toLowerCase() +
        Character.toUpperCase(s2.charAt(0)) +
        s2.substring(1).toLowerCase();

    System.out.printf("""
        Nazwa złożona ze słów '%s' i '%s' \
        zapisana w Camel Case to %s
        """,
        s1, s2, nazwaWCamelCase
    );
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
