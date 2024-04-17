import java.util.Scanner;

public class MalejacyLubRosnacyCiagTrzechLiczb {
  public static void main(String[] args) {
    System.out.println("Podaj trzy liczby:");
    int x = pobierzLiczbe();
    int y = pobierzLiczbe();
    int z = pobierzLiczbe();

    if (x > y && y > z) {
      System.out.println("Ten ciąg liczb jest malejący.");
    } else if (x < y && y < z) {
      System.out.println("Ten ciąg liczb jest rosnący.");
    } else {
      System.out.println(
          "Nie jest to ani malejący ciąg liczb, ani rosnący."
      );
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
