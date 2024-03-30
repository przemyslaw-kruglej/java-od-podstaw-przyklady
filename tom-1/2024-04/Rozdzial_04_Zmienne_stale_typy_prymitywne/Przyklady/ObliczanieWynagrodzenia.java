public class ObliczanieWynagrodzenia {
  public static void main(String[] args) {
    int podstawaWynagrodzenia = 3500;

    double cenaJednostkowaTowaru = 449.99;
    int iloscSprzedanychTowarow = 7;

    double lacznaWartoscSprzedanychTowarow =
        cenaJednostkowaTowaru * iloscSprzedanychTowarow;

    double marzaOdSprzedazy = 0.12;

    double miesieczneWynagrodzenie =
        podstawaWynagrodzenia +
        lacznaWartoscSprzedanychTowarow * marzaOdSprzedazy;

    System.out.println(
        "Miesięczne wynagrodzenie wynosi: " +
        miesieczneWynagrodzenie
    );
  }
}
