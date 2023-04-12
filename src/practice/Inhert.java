package practice;
//class Parent {
//	int i= 10;
//	void m1()
//	{
//		System.out.println("parent");
//	}
//	
//}



  class Par{
	  int i = 10;
	  void m1()
	  {
		  System.out.println("parent");
	  }
	  
  }
  class Child extends Par  {
	   int i = 20 ;
	   void m2()
	   {
		   System.out.println("child");
	   }
	  
  }
public class Inhert {

	public static void main(String[] args) {
	    Par p = new Par();
	    	p.m1();
	    	System.out.println(p.i);
	  
	    	Child c = new Child();
	         c.m2();
	         c.m1();
	        System.out.println(c.i);

	        Par p2 = new Child();
	        p2.m1();
//	        p2.m2();
	        System.out.println(p2.i);
	        
	        
	        
	}

}
