import java.util.Scanner;

public class CamelCaseNaSnakeCase {
  public static void main(String[] args) {
    System.out.print(
        "Podaj nazwę w standardzie camelCase: "
    );
    String nazwaWCamelCase = pobierzSlowo();
    String nazwaWSnakeCase = "";

    for (int i = 0; i < nazwaWCamelCase.length(); i++) {
      char znak = nazwaWCamelCase.charAt(i);

      if (Character.isUpperCase(znak)) {
        nazwaWSnakeCase +=
            "_" + Character.toLowerCase(znak);
      } else {
        nazwaWSnakeCase += znak;
      }
    }

    System.out.printf(
        "Nazwa %s zapisana w snake_case to: %s",
        nazwaWCamelCase,
        nazwaWSnakeCase
    );
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
