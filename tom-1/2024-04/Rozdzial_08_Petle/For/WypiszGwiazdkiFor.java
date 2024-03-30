import java.util.Scanner;

public class WypiszGwiazdkiFor {
  public static void main(String[] args) {
    System.out.print("Ile gwiazdek wypisać? ");
    int liczbaGwiazdek = pobierzLiczbe();

    for (int i = 0; i < liczbaGwiazdek; i++) {
      System.out.print("*");
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
