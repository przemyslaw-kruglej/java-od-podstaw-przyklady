public class WypisywanieZmiennychNaEkran {
  public static void main(String[] args) {
    double pi = 3.14;
    double kwadratPi;
    kwadratPi = pi * pi;

    System.out.println(pi);
    System.out.println("Pi to w przybliżeniu: " + pi);
    System.out.println(
        "Pi to w przybliżeniu: " + pi +
        ", a kwadrat liczby Pi to " + kwadratPi
    );
  }
}
