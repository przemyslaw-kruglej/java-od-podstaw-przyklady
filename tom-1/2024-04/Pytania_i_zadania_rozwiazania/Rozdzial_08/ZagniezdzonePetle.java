public class ZagniezdzonePetle {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 1) {
        continue;
      }

      for (int j = 1; j <= 10; j++) {
        System.out.print(j + " ");

        if (j > i) {
          System.out.println();
          break;
        }
      }
    }
  }
}