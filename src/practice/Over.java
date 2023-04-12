package practice;


class Parent
{
	int i = 10;
	void m1 ()
	{
		System.out.println("parent");
	}
	
	}

public class Over extends Parent  {
         int i = 20;
         void m1()
         {
        	 System.out.println("child");
         
         }
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.m1();
		System.out.println(p1.i);
		
		Over o1 = new Over();
		o1.m1();
		System.out.println(o1.i);
		
		Parent p2 = new Over();
		p2.m1();
		System.out.println(p2.i);
	}

}
