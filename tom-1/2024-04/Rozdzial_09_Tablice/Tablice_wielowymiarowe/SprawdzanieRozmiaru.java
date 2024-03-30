public class SprawdzanieRozmiaru {
  public static void main(String[] args) {
    int[][] tablica2d = new int[3][5];

    System.out.println(
        "Rozmiar - pierwszy wymiar: " + tablica2d.length
    );
    System.out.println(
        "Rozmiar - drugi wymiar: " + tablica2d[0].length
    );

    int[][] tablica2d2 = new int[][] { {1}, { 2, 3 } };
  }
}
