public class ZagniezdzonaPetlaIBreak2 {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(j + ", ");

        if (j == 1) {
          break;
        }
      }

      System.out.println();
      break; // przerwie zewnętrzną pętlę
    }
  }
}
