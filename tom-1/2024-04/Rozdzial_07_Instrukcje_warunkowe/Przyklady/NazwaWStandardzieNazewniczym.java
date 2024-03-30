import java.util.Scanner;

public class NazwaWStandardzieNazewniczym {
  public static void main(String[] args) {
    System.out.print("Podaj pierwsze słowo: ");
    String s1 = pobierzSlowo();

    System.out.print("Podaj drugie słowo: ");
    String s2 = pobierzSlowo();

    System.out.println("""
        Możliwe standardy nazewnicze, w których \
        podane słowa mogą zostać zapisane:
        1 - Camel Case
        2 - snake_case
        3 - SCREAMING_SNAKE_CASE""");

    System.out.print("Wybierz standard nazewniczy: ");
    int standardNazewniczy = pobierzLiczbe();

    if (standardNazewniczy < 1 || standardNazewniczy > 3) {
      System.out.println("Nieprawidłowy numer standardu.");
    } else {
      String nazwa = switch (standardNazewniczy) {
        case 1 -> s1.toLowerCase() +
                  Character.toUpperCase(s2.charAt(0)) +
                  s2.substring(1).toLowerCase();
        case 2 -> s1.toLowerCase() + "_" + s2.toLowerCase();
        default ->
            s1.toUpperCase() + "_" + s2.toUpperCase();
      };

      System.out.println("""
          Słowa %s i %s zapisane w wybranym \
          standardzie nazewniczym to: %s
          """.formatted(s1, s2, nazwa)
      );
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
