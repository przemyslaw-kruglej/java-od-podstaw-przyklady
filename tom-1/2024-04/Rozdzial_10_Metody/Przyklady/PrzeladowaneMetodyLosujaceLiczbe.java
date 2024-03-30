import java.util.concurrent.ThreadLocalRandom;

public class PrzeladowaneMetodyLosujaceLiczbe {
  public static void main(String[] args) {
    System.out.println(wylosujLiczbe());

    System.out.println(wylosujLiczbe(10));
    System.out.println(wylosujLiczbe(100));

    System.out.println(wylosujLiczbe(-10, -5));
    System.out.println(wylosujLiczbe(1000, 2000));
  }

  public static int wylosujLiczbe() {
    return ThreadLocalRandom.current().nextInt();
  }

  public static int wylosujLiczbe(int max) {
    return ThreadLocalRandom.current().nextInt(max);
  }

  public static int wylosujLiczbe(int min, int max) {
    return ThreadLocalRandom.current().nextInt(min, max);
  }
}
