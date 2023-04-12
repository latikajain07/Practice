package practice;

class MyThread extends Thread 
{
	public void run()
	{
		 for (int i=1; i<=5; i++)
		 {
//			 setName("latika");
		
			 System.out.println(Thread.currentThread().getName());
		 }
	}
 }

public class JavaEight {
	
	public static void main(String[] args) {
	               
	  MyThread t = new MyThread();
//	   t.run();
	  
        t.start();
        t.setPriority(10);
//        System.out.println(t.getPriority());
//        System.out.println(Thread.currentThread().getName());
	 for (int i=1;i<=5;i++)
	   {  
		  t.setName("hello");
		  System.out.println(Thread.currentThread().getName());
	     
	   }
	    	          
	}

}
