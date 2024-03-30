import java.util.Scanner;

public class LiczenieObwoduTrojkata {
  public static void main(String[] args) {
    System.out.print("Podaj długość boku a: ");
    int bokA = pobierzLiczbe();

    System.out.print("Podaj długość boku b: ");
    int bokB = pobierzLiczbe();

    System.out.print("Podaj długość boku c: ");
    int bokC = pobierzLiczbe();

    int obwod = bokA + bokB + bokC;

    System.out.println("""
        Liczę obwód trójkąta o bokach:
          a = %d
          b = %d
          c = %d

        Wynik: %d""".formatted(bokA, bokB, bokC, obwod)
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
