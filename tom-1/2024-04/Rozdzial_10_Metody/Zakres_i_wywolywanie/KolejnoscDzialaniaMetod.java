import java.util.Scanner;

public class KolejnoscDzialaniaMetod {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę: ");

    int podanaLiczba = pobierzLiczbe();

    System.out.println("Teraz policzę kwadrat tej liczby.");

    int liczbaDoKwadratu = policzKwadrat(podanaLiczba);

    System.out.println(
        "Kwadrat tej liczby wynosi " + liczbaDoKwadratu
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static int policzKwadrat(int liczba) {
    System.out.println("Liczę kwadrat liczby " + liczba);
    return liczba * liczba;
  }
}
