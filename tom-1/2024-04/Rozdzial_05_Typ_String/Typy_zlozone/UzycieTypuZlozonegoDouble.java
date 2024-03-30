public class UzycieTypuZlozonegoDouble {
  public static void main(String[] args) {
    Double pi = 3.14;
    Integer promien = 7;

    double poleKola = pi * promien * promien;

    System.out.printf(
        "Pole koła o promieniu %d wynosi %f",
        promien,
        poleKola
    );
  }
}
