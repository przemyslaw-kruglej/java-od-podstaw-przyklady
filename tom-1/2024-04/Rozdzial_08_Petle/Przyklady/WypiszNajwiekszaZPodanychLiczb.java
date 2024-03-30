import java.util.Scanner;

public class WypiszNajwiekszaZPodanychLiczb {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę: ");
    int najwiekszaLiczba = pobierzLiczbe();

    while (true) {
      System.out.print(
          "Czy chcesz podać kolejną liczbę? [t/n] "
      );
      String czyKolejna = pobierzSlowo();

      if (!"t".equals(czyKolejna)) {
        break;
      }

      System.out.print("Podaj kolejną liczbę: ");
      int nowaLiczba = pobierzLiczbe();

      if (nowaLiczba > najwiekszaLiczba) {
        najwiekszaLiczba = nowaLiczba;
      }
    }

    System.out.println(
        "Największa liczba z podanych to " +
        najwiekszaLiczba
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}