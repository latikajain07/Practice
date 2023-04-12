package practice;

public class TryBlock {

	public static void main(String[] args) {
	
		
		try {
		
			System.out.println("abc");
			System.out.println("xyz");
			System.out.println("10/0");
			System.out.println("hello");
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	     
	}
	}
