public class StalaTablica {
  public static void main(String[] args) {
    int[] liczby = { 10, 100, -42, 7, 15 };
    final int[] inneLiczby = { 5, 10, 15 };

    System.out.println("Przed zmianami:");
    System.out.println("liczby[0] = " + liczby[0]);
    System.out.println("inneLiczby[0] = " + inneLiczby[0]);

    liczby[0] = 99;
    inneLiczby[0] = 50;

    System.out.println("\nPo zmianach:");
    System.out.println("liczby[0] = " + liczby[0]);
    System.out.println("inneLiczby[0] = " + inneLiczby[0]);
  }
}
