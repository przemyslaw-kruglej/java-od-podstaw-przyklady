import java.util.Scanner;

public class LiczbaDniDoKoncaRoku {
  public static void main(String[] args) {
    System.out.print("Podaj numer miesiąca: ");
    int miesiac = pobierzLiczbe();

    System.out.print("Podaj numer dnia miesiąca: ");
    int dzien = pobierzLiczbe();

    int ileDniMinelo = (miesiac - 1) * 30 + dzien;
    int liczbaDniaDoKoncaRoku = 360 - ileDniMinelo;

    System.out.println(
        "Liczba dnia do końca roku: " + liczbaDniaDoKoncaRoku
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
