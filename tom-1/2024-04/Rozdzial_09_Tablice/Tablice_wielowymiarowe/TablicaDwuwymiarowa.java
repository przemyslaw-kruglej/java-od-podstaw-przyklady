public class TablicaDwuwymiarowa {
  public static void main(String[] args) {
    int[][] tablica2d = new int[3][5];

    // pierwszy element pierwszej pod-tablicy
    tablica2d[0][0] = 5;

    // drugi, trzeci, i czwarty element drugiej pod-tablicy
    tablica2d[1][1] = 10;
    tablica2d[1][2] = 100;
    tablica2d[1][3] = 1000;

    // czwarty element trzeciej pod-tablicy
    tablica2d[2][3] = 50;

    // pierwszy element pierwszej pod-tablicy
    System.out.println(tablica2d[0][0]);

    // drugi i trzeci element drugiej pod-tablicy
    System.out.println(tablica2d[1][1]);
    System.out.println(tablica2d[1][2]);

    // czwarty element trzeciej pod-tablicy
    System.out.println(tablica2d[2][3]);
  }
}