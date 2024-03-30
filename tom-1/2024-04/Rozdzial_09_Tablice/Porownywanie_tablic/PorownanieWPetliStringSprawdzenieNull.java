public class PorownanieWPetliStringSprawdzenieNull {
  public static void main(String[] args) {
    String[] slowa = { "Ala", "ma", null };
    String[] inneSlowa = { "Ala", "ma", "kota" };

    if (slowa == null || inneSlowa == null ||
        slowa.length != inneSlowa.length) {
      System.out.println("Tablice nie są takie same.");
    } else {
      boolean roznicaZnaleziona = false;

      for (int i = 0; i < slowa.length; i++) {
        if (
            (slowa[i] == null && inneSlowa[i] != null) ||
            (slowa[i] != null && !slowa[i].equals(inneSlowa[i]))
        ) {
          roznicaZnaleziona = true;
          break;
        }
      }

      if (roznicaZnaleziona) {
        System.out.println("Tablice nie są takie same.");
      } else {
        System.out.println("Tablice są takie same.");
      }
    }
  }
}
