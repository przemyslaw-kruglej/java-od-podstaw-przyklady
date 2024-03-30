public class SprawdzanieNull {
  public static void main(String[] args) {
    String[] zadaniaDoZrobienia =
        {
            "Nauka Java.",
            "Nakarmić kota.",
            null,
            "Zapłacić rachunki."
        };

    for (String zadanie : zadaniaDoZrobienia) {
      if (zadanie != null) {
        System.out.println(
            "Zadanie do zrobienia: " + zadanie
        );
      } else {
        System.out.println("Na liście zadań jest 'null'!");
      }
    }
  }
}
