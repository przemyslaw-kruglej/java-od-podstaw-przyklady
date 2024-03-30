import java.util.Scanner;

public class NajwiekszaZTrzechLiczb {
  public static void main(String[] args) {
    System.out.print("Podaj pierwszą liczbę: ");
    int x = pobierzLiczbe();

    System.out.print("Podaj drugą liczbę: ");
    int y = pobierzLiczbe();

    System.out.print("Podaj trzecią liczbę: ");
    int z = pobierzLiczbe();

    int max = x > y ? (x > z ? x : z) : (y > z ? y : z);
    System.out.println(
        "Największa z tych liczb to " + max
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
