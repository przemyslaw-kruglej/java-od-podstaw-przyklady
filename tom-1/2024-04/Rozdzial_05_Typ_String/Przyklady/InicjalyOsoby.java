public class InicjalyOsoby {
  public static void main(String[] args) {
    String imie = "Anna";
    String nazwisko = "Kowalska";

    char pierwszaLiteraImienia = imie.charAt(0);
    char pierwszaLiteraNazwiska = nazwisko.charAt(0);

    System.out.println(
        "Inicjały osoby \"" + imie + " " + nazwisko +
        "\" to: " + pierwszaLiteraImienia + "." +
        pierwszaLiteraNazwiska + "."
    );
  }
}
