package practice;

class Exceptionn {

	public static void main(String[] args) {
		
		System.out.println("ABC");
		System.out.println("xyz");
		try {
	     	System.out.println(10/0);
		}
		catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.toString());
			System.out.println(e.getMessage());	
			System.out.println("This is handing code");	
		}
		
		System.out.println("hello");
	}

}
