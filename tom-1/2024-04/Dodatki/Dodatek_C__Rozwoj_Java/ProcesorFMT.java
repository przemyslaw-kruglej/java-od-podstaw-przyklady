import static java.util.FormatProcessor.FMT;

public class ProcesorFMT {
  public static void main(String[] args) {
    double r = 7.1342;
    double pole = Math.PI * r * r;

    System.out.println(
        FMT."Pole koła o promieniu \{r} to: %.2f\{pole}"
    );
  }
}
