import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{ int x,y;
		x=sc.nextInt();
		y=sc.nextInt();
		if(x<y)
		{
		if((y-x)%2==0)
		System.out.println((y-x)/2);
		else System.out.println(((y-x)/2)+2);
		}
		else
		System.out.println(x-y);
		
	}
}
}
