public class RzutowanieIZaokraglanie {
  public static void main(String[] args) {
    float promien = 5.7f;
    final float PI = 3.14f;

    int obwodKola = (int) (2 * PI * promien);
    int poleKola = Math.round(PI * promien * promien);

    System.out.println("Obwód koła: " + obwodKola);
    System.out.println("Pole koła: " + poleKola);
  }
}
