import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MagicznaKulaNr8 {
  public static void main(String[] args) {
    String[] odpowiedzi = {
        "Tak.",
        "Być może.",
        "Raczej nie.",
        "Nie.",
        "Nie wiem.",
        "Nie liczyłbym na to.",
        "Lepiej, żebyś nie wiedział(a).",
        "W tej chwili Ci nie powiem, spróbuj później."
    };

    System.out.println("Co chcesz wiedzieć?");
    String pytanie = pobierzLinieTekstu();

    int indeksWylosowanejOdpowiedzi =
        ThreadLocalRandom.current().nextInt(odpowiedzi.length);

    System.out.printf(
        "Pytasz \"%s\"... %s",
        pytanie,
        odpowiedzi[indeksWylosowanejOdpowiedzi]
    );
  }

  public static String pobierzLinieTekstu() {
    return new Scanner(System.in).nextLine();
  }
}
