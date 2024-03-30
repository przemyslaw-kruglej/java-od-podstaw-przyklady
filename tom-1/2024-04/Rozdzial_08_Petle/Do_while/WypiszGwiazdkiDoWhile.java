import java.util.Scanner;

public class WypiszGwiazdkiDoWhile {
  public static void main(String[] args) {
    System.out.print("Ile gwiazdek wypisać? ");
    int liczbaGwiazdek = pobierzLiczbe();

    // wypisze jedną gwiazdką, gdy podamy 0
    do {
      System.out.print("*");
      liczbaGwiazdek--;
    } while (liczbaGwiazdek > 0);
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
