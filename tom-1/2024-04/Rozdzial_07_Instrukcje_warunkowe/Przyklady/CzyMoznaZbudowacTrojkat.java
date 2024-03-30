import java.util.Scanner;

public class CzyMoznaZbudowacTrojkat {
  public static void main(String[] args) {
    System.out.print("Podaj pierwszy bok trójkąta: ");
    int a = pobierzLiczbe();

    System.out.print("Podaj drugi bok trójkąta: ");
    int b = pobierzLiczbe();

    System.out.print("Podaj trzeci bok trójkąta: ");
    int c = pobierzLiczbe();

    if (a + b > c && a + c > b && b + c > a) {
      System.out.println(
          "Z tych boków można zbudować trójkąt."
      );
    } else {
      System.out.println(
          "Z tych boków nie można zbudować trójkąta."
      );
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
