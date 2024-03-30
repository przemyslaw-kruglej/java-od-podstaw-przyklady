public class WypiszLiczbyOd1Do5ForZakresZmiennej {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
    }

    // błąd - zmienna i już w tym momencie nie istnieje
    // odkomentuj poniższą linię, aby zobaczyć, jak błąd zgłosi kompilator
    // System.out.println("Po ukończeniu pętli i = " + i);
  }
}
