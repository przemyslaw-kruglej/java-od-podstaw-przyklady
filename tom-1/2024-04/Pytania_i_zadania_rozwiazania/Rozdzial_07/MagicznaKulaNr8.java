import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MagicznaKulaNr8 {
  public static void main(String[] args) {
    System.out.println("Co chcesz wiedzieć?");
    String pytanie = pobierzLinieTekstu();

    int numerOdpowiedzi =
        ThreadLocalRandom.current().nextInt(8) + 1;

    String odpowiedz = switch (numerOdpowiedzi) {
      case 1 -> "Tak.";
      case 2 -> "Być może.";
      case 3 -> "Raczej nie.";
      case 4 -> "Nie.";
      case 5 -> "Nie wiem.";
      case 6 -> "Nie liczyłbym na to.";
      case 7 -> "Lepiej, żebyś nie wiedział(a).";
      default ->
          "W tej chwili Ci nie powiem, spróbuj później.";
    };

    System.out.printf(
        "Pytasz \"%s\"... %s", pytanie, odpowiedz
    );
  }

  public static String pobierzLinieTekstu() {
    return new Scanner(System.in).nextLine();
  }
}
