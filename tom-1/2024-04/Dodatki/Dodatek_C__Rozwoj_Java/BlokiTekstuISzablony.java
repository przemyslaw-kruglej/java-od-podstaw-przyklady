public class BlokiTekstuISzablony {
  public static void main(String[] args) {
    String nazwaProduktu = "Java od podstaw T1";
    String autor = "Przemysław Kruglej";
    int rokWydania = 2024;

    String daneProduktu = STR."""
        {
          "produkt": "\{nazwaProduktu}",
          "autor": "\{autor}",
          "rokProdukcji": \{rokWydania}
        }""";

    System.out.println(daneProduktu);
  }
}
