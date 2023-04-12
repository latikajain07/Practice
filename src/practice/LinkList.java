package practice;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int t =sc.nextInt();
				System.out.println("please enter Names");
		  LinkedList<String> str= new LinkedList<>();
	       for (int i= 0; i<t;i++)
		 {
			 String b= sc.next();
			 str.add(b);
			 
		 }
		System.out.println("My arraylist"+str);
		
//		System.out.println("Add First");
//		String c=sc.next();
//		str.addFirst(c);
//		System.out.println(str);
		
//		System.out.println("Last First");
//		String c=sc.next();
//		str.addLast(c);
//		System.out.println(str);
//		
		
//		System.out.println("Object get First");
//    	System.out.println(str.getFirst());
        
//		System.out.println("Object get Last");
//    	System.out.println(str.getLast());
    	
//		System.out.println("Object remove First");
//    	System.out.println(str.removeFirst());
//		System.out.println("final list"+str);
    	
//    	System.out.println("Object remove Last");
//    	System.out.println(str.removeLast());
//    	System.out.println("final list"+str);
//	
	}
    
}
