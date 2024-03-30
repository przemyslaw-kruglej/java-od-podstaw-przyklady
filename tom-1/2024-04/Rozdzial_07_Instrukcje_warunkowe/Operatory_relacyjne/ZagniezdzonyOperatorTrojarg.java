public class ZagniezdzonyOperatorTrojarg {
  public static void main(String[] args) {
    int y = -2;
    String komunikat;

    if (y < 0) {
      komunikat = "mniejsze od zero";
    } else if (y > 0) {
      komunikat = "większe od zero";
    } else {
      komunikat = "równe zero";
    }

    // odpowiednik powyższej instrukcji warunkowej
    // zapisany za pomocą zagnieżdżonych
    // trójargumentowych operatorów logicznych
    komunikat = y < 0 ? "mniejsze od zero" :
        (y > 0 ? "większe od zero" : "równe zero");
  }
}
