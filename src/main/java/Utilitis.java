import java.util.ArrayList;
import java.util.List;

public class Utilitis {

  public static <T> void refreshList(List<T> def, T defaul) {
    for (int i = 0; i < def.size(); i++) {
      def.set(i,defaul);
    }


  }



    public static void main(String[] args) {
      List<Integer> lista = new ArrayList<>();
      lista.add(1);
      lista.add(2);
      System.out.println(lista);

      refreshList(lista, 100);
      System.out.println(lista);

    }
  }

