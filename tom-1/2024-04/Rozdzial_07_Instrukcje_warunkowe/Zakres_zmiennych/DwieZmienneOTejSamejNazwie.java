public class DwieZmienneOTejSamejNazwie {
  public static void main(String[] args) {
    int pewnaLiczba = 5;

    if (pewnaLiczba > 0) {
      int kwadratLiczby = pewnaLiczba * pewnaLiczba;
      System.out.printf(
          "Kwadrat %d wynosi %d\n",
          pewnaLiczba,
          kwadratLiczby
      );
    }

    int innaLiczba = 25;
    int kwadratLiczby = innaLiczba * innaLiczba;

    System.out.printf(
        "Kwadrat %d wynosi %d",
        innaLiczba,
        kwadratLiczby
    );
  }
}
