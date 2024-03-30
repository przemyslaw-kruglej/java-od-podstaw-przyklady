public class WypiszTabliceDwuwymiarowaZForEach2 {
  public static void main(String[] args) {
    int[][] liczby = {
        { 5, 10, 15 },
        { 7, 13, 42 },
        { -1, 0, 1 },
        { 100, 1000, 10000 },
        { -33, 66, 99 }
    };

    for (int[] podTablica : liczby) {
      for (int liczba : podTablica) {
        System.out.print(liczba + " ");
      }
      System.out.println();
    }
  }
}
