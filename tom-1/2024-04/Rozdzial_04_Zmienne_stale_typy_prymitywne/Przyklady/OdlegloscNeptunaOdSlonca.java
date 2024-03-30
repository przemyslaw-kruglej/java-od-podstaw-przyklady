public class OdlegloscNeptunaOdSlonca {
  public static void main(String[] args) {
    long odlegloscNeptunaOdSloncaWKm = 4_495_000_000L;

    final double KM_NA_MILE = 0.621;

    double odlegloscNeptunaOdSloncaWMilach =
        odlegloscNeptunaOdSloncaWKm * KM_NA_MILE;

    System.out.println(
        "Odległość Neptuna od Słońca w milach wynosi: " +
        odlegloscNeptunaOdSloncaWMilach
    );
  }
}
