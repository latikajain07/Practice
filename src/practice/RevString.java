package practice;

public class RevString {

	public static void main(String[] args) {
		String S= "how are you";
		String v="";
		int len= S.length();
		for (int i=len-1;i>=0;i--)
		{
			v=v+S.charAt(i);
		}
		System.out.println(v);
        
	}

}
