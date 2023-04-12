package practice;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {

	public static void main(String[] args) {
	  HashSet<String> stu= new HashSet<>();
         stu.add("jgdsjha");
         stu.add("jsdha");
         stu.add("hii");
         stu.add("heloo");
         stu.add("heloo");
          
         Iterator<String>i=stu.iterator();
         while(i.hasNext())
          {
            System.out.println(i.next());
             }
          }
 
}
