import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{ 
		    int a=0,b=0;
		    for(int i=1;i<=5;i++)
		    {
		    int R1=sc.nextInt();
		    if(R1 == 1)
		    a=a+1 ;
		    if (R1 == 2)
		    b=b+1;
		    }
		    if (a>b)
		    System.out.println("INDIA");
		    else 
		    if (b>a)
		    System.out.println("ENGLAND");
		    else
		    System.out.println("DRAW");
		}
	}
}
