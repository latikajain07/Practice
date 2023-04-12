package practice;

public class ReverseString {

	public static void main(String[] args) {
		String s= "latika"; 
		String t= "";
	    int len = s.length();
	    for (int i=0;i<=len-1;i++)
	    {
	    	if(s.charAt(i)=='a')
	    	{
	    		t+='f';
	    	}
	    	else 
	    	{
	    		t=t+s.charAt(i);
	    	}
	      
	    }
	    System.out.println(t);
	    
	}

}
