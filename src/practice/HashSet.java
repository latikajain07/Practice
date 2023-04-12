package practice;

import java.util.LinkedHashSet;
import java.util.Scanner;


public class HashSet {

	public static void main(String[] args) {
		java.util.HashSet<String> set = new java.util.HashSet<>();
		Scanner sc = new Scanner(System.in);
		 int t =sc.nextInt();
		 System.out.println("Please enter name");
        
        for(int i= 0; i<t;i++)
        {
           String b = sc.next();
             set.add(b);
        }
        System.out.println(set);
	
//	   System.out.println("set remove");
//	     String c=sc.next();
//	     set.remove(c);
//	     System.out.println(set);
        
//        System.out.println("Clone");
//	     
//	     System.out.println(set.clone());
       
//        System.out.println("set contain");   // info about element that is in a set or not
//	     String c=sc.next();
//	     System.out.println(set.contains(c)); 
	     
//	     System.out.println("Iterator");
//   	  System.out.println(set.iterator());
        
         
        
	
	}

}
