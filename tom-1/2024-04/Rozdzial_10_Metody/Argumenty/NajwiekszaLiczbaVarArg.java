public class NajwiekszaLiczbaVarArg {
  public static void main(String[] args) {
    int x = znajdzNajwieksza(7, 3, 55);
    int y = znajdzNajwieksza(100, 10);
    int z = znajdzNajwieksza(1, 100, 10, 25);

    System.out.printf("x: %d, y: %d, z: %d", x, y, z);
  }

  public static int znajdzNajwieksza(int... liczby) {
    int najwieksza = liczby[0];

    for (int i = 1; i < liczby.length; i++) {
      if (liczby[i] > najwieksza) {
        najwieksza = liczby[i];
      }
    }

    return najwieksza;
  }
}
