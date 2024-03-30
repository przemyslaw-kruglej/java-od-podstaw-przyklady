public class LiczbaSekundWStyczniu {
  public static void main(String[] args) {
    final int LICZBA_SEKUND_W_MINUCIE = 60;
    final int LICZBA_MINUT_W_GODZINIE = 60;
    final int LICZBA_GODZIN_W_DNIU = 24;
    final int LICZBA_DNI_W_STYCZNIU = 31;

    final int LICZBA_SEKUND_W_STYCZNIU =
        LICZBA_DNI_W_STYCZNIU *
        LICZBA_GODZIN_W_DNIU *
        LICZBA_MINUT_W_GODZINIE *
        LICZBA_SEKUND_W_MINUCIE
    ;

    System.out.println(
        "Styczeń trwa " + LICZBA_SEKUND_W_STYCZNIU +
        " sekund."
    );
  }
}
