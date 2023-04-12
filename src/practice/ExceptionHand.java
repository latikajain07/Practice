package practice;

public class ExceptionHand extends Thread {

	
		public void run()
		{
			 for (int i=1; i<=5; i++)
			 {
				 try {
					 sleep(1000);
					 System.out.println("hiii"+i);
					 
				 }
				 catch (Exception e) {
					
				 }			
				 
			 }
		}
	 
	
	public static void main(String[] args) {
		 ExceptionHand t = new ExceptionHand();

		  
	        t.start();

	        for (int i=1; i<=5; i++)
			 {
				 try {
					// sleep(1000);
					 System.out.println(i);
			
					 
				 }
				 catch (Exception e) {
					
				 }			
				 
			 }
		    	          
		}


	}


