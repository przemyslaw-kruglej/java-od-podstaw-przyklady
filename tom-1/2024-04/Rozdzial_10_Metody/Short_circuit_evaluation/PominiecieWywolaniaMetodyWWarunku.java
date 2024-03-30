public class PominiecieWywolaniaMetodyWWarunku {
  public static void main(String[] args) {
    if (czyPadaDeszcz() && czyParasolZepsuty()) {
      System.out.println("Zmoknę.");
    } else {
      System.out.println("Uff, nie zmoknę.");
    }
  }

  public static boolean czyPadaDeszcz() {
    System.out.println("Sprawdzam czy pada deszcz...");
    System.out.println("Wyglądam przez okno...");
    System.out.println("Nie pada!");

    return false;
  }

  public static boolean czyParasolZepsuty() {
    System.out.println("Sprawdzam, czy parasol działa...");
    System.out.println("O nie! Dziurawy!");

    return true;
  }
}
