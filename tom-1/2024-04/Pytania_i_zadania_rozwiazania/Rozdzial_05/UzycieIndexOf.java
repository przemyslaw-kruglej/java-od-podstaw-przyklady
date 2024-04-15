import java.util.Scanner;

public class UzycieIndexOf {
  public static void main(String[] args) {
    System.out.print("Podaj pierwsze słowo: ");
    String slowo1 = pobierzSlowo();

    System.out.print("Podaj drugie słowo: ");
    String slowo2 = pobierzSlowo();

    System.out.println(slowo1.indexOf(slowo2));
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
