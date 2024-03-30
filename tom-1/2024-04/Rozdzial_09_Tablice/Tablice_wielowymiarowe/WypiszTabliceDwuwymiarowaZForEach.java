public class WypiszTabliceDwuwymiarowaZForEach {
  public static void main(String[] args) {
    int[][] liczby = {
        { 5, 10, 15 },
        { 7, 13, 42 },
        { -1, 0, 1 },
        { 100, 1000, 10000 },
        { -33, 66, 99 }
    };

    for (int[] podTablica : liczby) {
      for (int i = 0; i < podTablica.length; i++) {
        System.out.print(podTablica[i] + " ");
      }
      System.out.println();
    }
  }
}
