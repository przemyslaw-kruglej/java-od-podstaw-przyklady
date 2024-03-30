public class NullWTablicyDlugoscStringa {
  public static void main(String[] args) {
    String[] kolory = new String[3];

    kolory[0] = "czerwony";
    kolory[1] = "zielony";

    for (String str : kolory) {
      System.out.printf(
          "String '%s' ma długość %d\n", str, str.length()
      );
    }
  }
}
