package practice;

abstract class Abstr {
      
		abstract void m1();
		abstract void m2();
		abstract void m3();
		abstract void m4();
		
	}
  abstract class B extends Abstr {
		abstract void m1();
		abstract void m2();
		abstract void m3();
	      public void m4()
		{
			System.out.println("hello");
		}
		
	}
   class C extends B {
		 public void m1() {}
		
		 public  void m2() 
		  {
			  System.out.println("chal nikal");
		  }
	      public void m3() {}
	      
	public static void main(String[] args) {
     
	 C c = new C();
         c.m2();
	}
	
}