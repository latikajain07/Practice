package practice;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		int t = sc.nextInt();
	int	 n=5678;
		int sum=0;
		int r=0;
	    while (n>0)
	    {
	    	r=n%10;
	    	
	    	sum =sum+(r*r*r);
	    	
	    	
	    	n=n/10;
	    }
	    System.out.print(sum);
		}

	}


