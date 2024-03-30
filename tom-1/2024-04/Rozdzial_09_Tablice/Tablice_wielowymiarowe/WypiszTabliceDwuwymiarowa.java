public class WypiszTabliceDwuwymiarowa {
  public static void main(String[] args) {
    int[][] liczby = {
        { 5, 10, 15 },
        { 7, 13, 42 },
        { -1, 0, 1 },
        { 100, 1000, 10000 },
        { -33, 66, 99 }
    };

    for (int rzad = 0; rzad < liczby.length; rzad++) {
      for (int kol = 0; kol < liczby[rzad].length; kol++) {
        System.out.print(liczby[rzad][kol] + " ");
      }
      System.out.println();
    }
  }
}
