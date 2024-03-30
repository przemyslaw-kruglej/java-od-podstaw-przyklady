public class LiczbaLiteryAWZdaniu {
  public static void main(String[] args) {
    String zdanie =
        "Uczę się podstaw programowania w JAVIE.";

    int dlugoscZdania = zdanie.length();

    String zdanieBezLiteryA =
        zdanie.toLowerCase().replace("a", "");

    int dlugoscZdaniaBezLiteryA = zdanieBezLiteryA.length();

    int liczbaLiterAWZdaniu =
        dlugoscZdania - dlugoscZdaniaBezLiteryA;

    System.out.println("W zdaniu:");
    System.out.println("\n\t" + zdanie);
    System.out.println(
        "\njest " + liczbaLiterAWZdaniu + " liter 'a'."
    );
  }
}
