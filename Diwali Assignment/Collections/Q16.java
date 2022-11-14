
import java.util.*;

  public class Q16 {
  public static void main(String[] args) {

     HashSet<String> h_set = new HashSet<String>();

          h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");
    System.out.println("Original Hash Set: " + h_set);

    h_set.removeAll(h_set);
    System.out.println("Hash Set after removing all the elements "+h_set);   
   }
}
