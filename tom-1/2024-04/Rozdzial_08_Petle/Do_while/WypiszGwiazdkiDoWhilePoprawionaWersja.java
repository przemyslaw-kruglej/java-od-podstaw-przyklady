import java.util.Scanner;

public class WypiszGwiazdkiDoWhilePoprawionaWersja {
  public static void main(String[] args) {
    System.out.print("Ile gwiazdek wypisać? ");
    int liczbaGwiazdek = pobierzLiczbe();

    if (liczbaGwiazdek > 0) {
      do {
        System.out.print("*");
        liczbaGwiazdek--;
      } while (liczbaGwiazdek > 0);
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
