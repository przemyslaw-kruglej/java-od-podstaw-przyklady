public class StringLengthCharAt {
  public static void main(String[] args) {
    String komunikat = "Witaj!";

    int liczbaZnakow = komunikat.length();

    System.out.println(
        "Liczba znaków w komunikacie to: " + liczbaZnakow
    );

    // musimy odjąć 1 od wyniku length(), ponieważ
    // indeksy znaków zaczynają się od 0, a nie 1
    char ostatniZnak =
        komunikat.charAt(komunikat.length() - 1);

    System.out.println("Ostatni znak to: " + ostatniZnak);
  }
}
