package practice;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=37351;
		int r=0;
		
		  while(n>0)
		  {
			  r=n%10;
			  System.out.println(r);
			  n=n/10;
		  }
	}
}

