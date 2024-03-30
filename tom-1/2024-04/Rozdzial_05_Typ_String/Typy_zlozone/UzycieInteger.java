import java.util.Scanner;

public class UzycieInteger {
  public static void main(String[] args) {
    String liczbaJakoString = "12345";
    int x = Integer.parseInt(liczbaJakoString);
    System.out.println("x ma wartość " + x);

    System.out.printf(
        "Zakres typu int: od %d do %d\n",
        Integer.MIN_VALUE,
        Integer.MAX_VALUE
    );

    System.out.print("Podaj liczbę: ");
    int liczba = pobierzLiczbe();

    System.out.printf(
        "Ta liczba w systemie dwójkowym (binarnym) to %s",
        Integer.toBinaryString(liczba)
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
