public class DwieZmienneDwieTablice {
  public static void main(String[] args) {
    char[] znaki = { 'k', 'o', 't' };
    char[] inneZnaki = znaki;

    znaki = new char[] { 'p', 'i', 'e', 's' };

    System.out.println("znaki[0]: " + znaki[0]);
    System.out.println("inneZnaki[0]: " + inneZnaki[0]);
  }
}
