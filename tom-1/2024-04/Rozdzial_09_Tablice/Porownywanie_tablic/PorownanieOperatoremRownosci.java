public class PorownanieOperatoremRownosci {
  public static void main(String[] args) {
    int[] liczby = { 7, 13, 42 };
    int[] inneLiczby = { 7, 13, 42 };

    if (liczby == inneLiczby) {
      System.out.println("Tablice są takie same.");
    } else {
      System.out.println("Tablice nie są takie same!");
    }
  }
}
