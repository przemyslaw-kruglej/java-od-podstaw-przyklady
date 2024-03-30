import java.util.concurrent.ThreadLocalRandom;

public class UdokumentowaneMetodyLosujaceLiczbe {
  public static void main(String[] args) {
    System.out.println(wylosujLiczbe());

    System.out.println(wylosujLiczbe(10));
    System.out.println(wylosujLiczbe(100));

    System.out.println(wylosujLiczbe(-10, -5));
    System.out.println(wylosujLiczbe(1000, 2000));
  }

  /**
   * Losuje liczbę z przedziału zakresu typu int,
   * to znaczy od -2147483648 do 2147483647.
   *
   * @author  Przemysław Kruglej
   * @return  liczba z zakresu typu int
   */
  public static int wylosujLiczbe() {
    return ThreadLocalRandom.current().nextInt();
  }

  /**
   * Zwraca losową liczbę z przedziału prawostronnie
   * otwartego <0, max).
   * Innymi słowy, minimalna zwrócona liczba to 0,
   * a maksymalna to max - 1.
   *
   * @param max  granica przedziału losowanych liczb
   * @return     losowa liczba z zakresu <0, max)
   */
  public static int wylosujLiczbe(int max) {
    return ThreadLocalRandom.current().nextInt(max);
  }

  /**
   * Zwraca losową liczbę z przedziału prawostronnie
   * otwartego <min, max).
   * Innymi słowy, minimalna zwrócona liczba to min,
   * a maksymalna to max - 1.
   *
   * @param min  minimalna liczba możliwa do wylosowania
   * @param max  granica przedziału losowanych liczb
   * @return     losowa liczba z zakresu <min, max)
   */
  public static int wylosujLiczbe(int min, int max) {
    return ThreadLocalRandom.current().nextInt(min, max);
  }
}
