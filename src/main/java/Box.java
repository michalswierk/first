import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Box <T> {
  private T y;

  public T getY() {
    return y;
  }

  public Box(T y) {
    this.y = y;
  }

  public static void main(String[] args) {

    Box <String> box= new Box<>("Hello");
    System.out.println(box.getY());
    Box <Integer> box2 = new Box<>(4444);
    System.out.println(box2.getY());
    int[] fibonaci= new int[10] ;
    fibonaci[0]=1;
    fibonaci[1]=1;

    for(int i = 2;i<fibonaci.length;i++)
     fibonaci[i] =  fibonaci[i - 1] + fibonaci[i - 2];
    for(int j=0;j<fibonaci.length;j++)
    System.out.println(fibonaci[j]);

  }

}
