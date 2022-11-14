
import java.util.*;
  public class Q21 {
  public static void main(String[] args) {

           PriorityQueue<String> pq1 = new PriorityQueue<String>();  

          pq1.add("Red");
          pq1.add("Green");
          pq1.add("Black");
          pq1.add("White");
    System.out.println("Original Priority Queue: "+pq1);
   
    pq1.clear();
 
    System.out.println("The New Priority Queue: " + pq1);
  } 
}
