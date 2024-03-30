import java.util.Scanner;

public class ZliczSamogloski {
  public static void main(String[] args) {
    System.out.print("Podaj słowo: ");
    String slowo = pobierzSlowo();

    int liczbaSamoglosek = 0;

    for (int i = 0; i < slowo.length(); i++) {
      char znak = slowo.charAt(i);

      if (znak == 'a' || znak == 'e' || znak == 'i' ||
          znak == 'u' || znak == 'y' || znak == 'o') {
        liczbaSamoglosek++;
      }
    }

    System.out.printf(
        "Liczba samogłosek w słowie \"%s\" to: %d",
        slowo,
        liczbaSamoglosek
    );
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
