import java.util.Arrays;
import java.util.Scanner;

public class CzySlowaZTakichSamychLiter {
  public static void main(String[] args) {
    System.out.print("Podaj pierwsze słowo: ");
    String slowo1 = pobierzSlowo();

    System.out.print("Podaj drugie słowo: ");
    String slowo2 = pobierzSlowo();

    char[] znaki1 = slowo1.toLowerCase().toCharArray();
    char[] znaki2 = slowo2.toLowerCase().toCharArray();

    Arrays.sort(znaki1);
    Arrays.sort(znaki2);

    char[] unikalne1 = new char[znaki1.length];

    int liczbaUnikalnych1 = 0;
    for (int i = 0; i < znaki1.length; i++) {
      if (i == 0 || znaki1[i] != znaki1[i - 1]) {
        unikalne1[liczbaUnikalnych1++] = znaki1[i];
      }
    }
    unikalne1 =
        Arrays.copyOfRange(unikalne1, 0, liczbaUnikalnych1);

    char[] unikalne2 = new char[znaki2.length];

    int liczbaUnikalnych2 = 0;
    for (int i = 0; i < znaki2.length; i++) {
      if (i == 0 || znaki2[i] != znaki2[i - 1]) {
        unikalne2[liczbaUnikalnych2++] = znaki2[i];
      }
    }
    unikalne2 =
        Arrays.copyOfRange(unikalne2, 0, liczbaUnikalnych2);

    if (Arrays.equals(unikalne1, unikalne2)) {
      System.out.println(
          "Te słowa składają się z takich samych znaków."
      );
    } else {
      System.out.println(
          "Te słowa składają się z innych znaków."
      );
    }
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
