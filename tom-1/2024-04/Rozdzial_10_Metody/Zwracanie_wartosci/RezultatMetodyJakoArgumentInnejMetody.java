import java.util.Scanner;

public class RezultatMetodyJakoArgumentInnejMetody {
  public static void main(String[] args) {
    System.out.print(
        "Podaj liczbę, a ja wypiszę jej kwadrat: "
    );
    System.out.println(podniesDoKwadratu(pobierzLiczbe()));
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static int podniesDoKwadratu(int liczba) {
    return liczba * liczba;
  }
}
