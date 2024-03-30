public class RzutowanieRoznychTypow {
  public static void main(String[] args) {
    long duzaLiczba = 12_345_678_900L;

    int i = (int) duzaLiczba;
    short s = (short) duzaLiczba;
    byte b = (byte) duzaLiczba;

    System.out.println("i ma wartość " + i);
    System.out.println("s ma wartość " + s);
    System.out.println("b ma wartość " + b);
  }
}
