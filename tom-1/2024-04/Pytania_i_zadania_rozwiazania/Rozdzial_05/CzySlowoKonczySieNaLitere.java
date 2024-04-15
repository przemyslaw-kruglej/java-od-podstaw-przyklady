import java.util.Scanner;

public class CzySlowoKonczySieNaLitere {
  public static void main(String[] args) {
    System.out.print("Podaj słowo: ");
    String slowo = pobierzSlowo();

    int indeksOstatniegoZnaku = slowo.length() - 1;

    System.out.println(
        Character.isLetter(
            slowo.charAt(indeksOstatniegoZnaku)
        )
    );
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
