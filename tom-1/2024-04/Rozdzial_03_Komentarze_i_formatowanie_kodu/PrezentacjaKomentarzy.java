/*
 To jest komentarz wielolinijkowy.
 Poniżej zaczyna się klasa TestKomentarzy.
*/
public class PrezentacjaKomentarzy {
  /**
   * To jest komentarz dokumentujący działanie metody main.
   * Metoda main jest punktem wejściowym każdego programu.
   */
  public static void main(String[] args) {
    // poniżej wypisujemy tekst na ekran
    System.out.println("Hej!"); // komentarz na końcu linii

    /*
       Poniższa linia kodu nie zostanie wykonana,
       ponieważ została zakomentowana.
    */
    // System.out.println("Halo?");

    System.out.println(
        /* kolejny komentarz */ "Witaj ponownie!"
    );
  }
}