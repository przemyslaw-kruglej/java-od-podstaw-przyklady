import java.util.Scanner;

public class MileNaKilometry {
  public static void main(String[] args) {
    System.out.print("Podaj odległość w milach: ");
    int liczbaMil = pobierzLiczbe();

    final double PRZELICZNIK_MILE_NA_KM = 1.61;
    double liczbaKm = liczbaMil * PRZELICZNIK_MILE_NA_KM;

    System.out.printf(
        "%d mil to %.4f kilometrów.",
        liczbaMil,
        liczbaKm
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
