public class WypisywanieDwuwymiarowejTablicy {
  public static void main(String[] args) {
    int[][] tab2d = {
        { 10, 20, 30, 40, 50 },
        { 1, 2, 3, 4, 5 },
        { 5, 10, 15, 20, 25 },
        { 100, 200, 300, 400, 500 },
        { -1, -2, -3, -4, -5 }
    };

    for (int rzad = 0; rzad < tab2d.length; rzad++) {
      if ((rzad + 1) % 2 == 0) {
        for (int j = tab2d[rzad].length - 1; j >= 0; j--) {
          System.out.print(tab2d[rzad][j] + " ");
        }
      } else {
        for (int liczba : tab2d[rzad]) {
          System.out.print(liczba + " ");
        }
      }
      System.out.println();
    }
  }
}
