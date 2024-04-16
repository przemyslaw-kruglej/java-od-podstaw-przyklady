import java.util.Scanner;

public class LiczbaOPrzeciwnymZnaku {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę: ");
    int liczba = pobierzLiczbe();

    System.out.println(-liczba);
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
