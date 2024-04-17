import java.util.Scanner;

public class SnakeCaseNaCamelCase {
  public static void main(String[] args) {
    System.out.println("""
        Podaj nazwę składającą się z dwóch słów \
        zapisaną w standardzie snake_case:"""
    );
    String nazwaWSnakeCase = pobierzSlowo();

    int indeksPodkreslenia = nazwaWSnakeCase.indexOf("_");

    if (indeksPodkreslenia == -1) {
      System.out.println(
          "W podanej nazwie nie ma znaku podkreślenia."
      );
    } else {
      String pierwszeSlowo =
          nazwaWSnakeCase.substring(0, indeksPodkreslenia);

      String drugieSlowo =
          nazwaWSnakeCase.substring(indeksPodkreslenia + 1);

      if (
          pierwszeSlowo.length() == 0 ||
          drugieSlowo.length() == 0
      ) {
        System.out.println(
            "Podana nazwa nie składa się z dwóch słów."
        );
      } else {
        String nazwaWCamelCase =
            pierwszeSlowo.toLowerCase() +
            Character.toUpperCase(drugieSlowo.charAt(0)) +
            drugieSlowo.substring(1).toLowerCase();

        System.out.println(
            "Ta nazwa zapisana w standardzie Camel Case to " +
            nazwaWCamelCase
        );
      }
    }
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
