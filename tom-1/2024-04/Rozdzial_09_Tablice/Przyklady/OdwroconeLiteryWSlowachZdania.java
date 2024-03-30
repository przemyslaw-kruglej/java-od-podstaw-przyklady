import java.util.Scanner;

public class OdwroconeLiteryWSlowachZdania {
  public static void main(String[] args) {
    System.out.println("Napisz zdanie: ");
    String zdanie = pobierzLinieTekstu();

    String[] slowa = zdanie.split(" ");

    for (String slowo : slowa) {
      for (int i = slowo.length() - 1; i >= 0; i--) {
        System.out.print(slowo.charAt(i));
      }
      System.out.print(" ");
    }
  }

  public static String pobierzLinieTekstu() {
    return new Scanner(System.in).nextLine();
  }
}
