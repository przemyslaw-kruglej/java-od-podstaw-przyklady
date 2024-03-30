public class PorownanieWPetliNullZBledem {
  public static void main(String[] args) {
    int[] liczby = { 7, 13, 42 };
    int[] inneLiczby = null;

    // spowoduje błąd NullPointerException
    if (liczby.length != inneLiczby.length) {
      System.out.println("Tablice różnią się długością.");
    } else {
      boolean roznicaZnaleziona = false;

      for (int i = 0; i < liczby.length; i++) {
        if (liczby[i] != inneLiczby[i]) {
          roznicaZnaleziona = true;
          break;
        }
      }

      if (roznicaZnaleziona) {
        System.out.println("Tablice nie są takie same.");
      } else {
        System.out.println("Tablice są takie same.");
      }
    }
  }
}
