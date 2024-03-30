public class ZmianaWartosciElementowTablicy {
  public static void main(String[] args) {
    String[] slowa = { "Ala", "ma", "kota" };

    System.out.println(
        slowa[0] + " " + slowa[1] + " " + slowa[2]
    );

    slowa[0] = "Ania";
    slowa[2] = "psa";

    System.out.println(
        slowa[0] + " " + slowa[1] + " " + slowa[2]
    );
  }
}
