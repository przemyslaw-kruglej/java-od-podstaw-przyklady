public class RekurencyjneLiczenieSilni {
  public static void main(String[] args) {
    System.out.println("Silnia 0 wynosi: " + silnia(0));
    System.out.println("Silnia 1 wynosi: " + silnia(1));
    System.out.println("Silnia 5 wynosi: " + silnia(5));
    System.out.println("Silnia 10 wynosi: " + silnia(10));
    System.out.println("Silnia 12 wynosi: " + silnia(12));
  }

  public static int silnia(int n) {
    if (n < 0) {
      return -1;
    } else if (n == 0) {
      return 1;
    } else {
      return silnia(n - 1) * n;
    }
  }
}
