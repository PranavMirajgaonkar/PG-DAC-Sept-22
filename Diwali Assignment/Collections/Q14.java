
import java.util.LinkedList;
import java.util.Collections;
  public class Q14 {
  public static void main(String[] args) {
          LinkedList<String> c1= new LinkedList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
          System.out.println("Original linked list: " + c1);

          c1.set(1, "Orange");
          System.out.println("The value of second element changed.");
          System.out.println("New linked list: " + c1);
   }
}
