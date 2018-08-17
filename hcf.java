import java.util.*;

class hcf
{
	public static void main(String args[])
	{
		 Scanner as=  new Scanner(System.in);
		long n1,n2;
	  n1=as.nextLong();
	  n2=as.nextLong();
	  long h =0;long temp;long a=n1,b=n2;
	   while(n2!=0)
	   {
		   temp=n2;
		   n2=n1%n2;
		   n1=temp;
		   
	   }
	    h=n1;
	   long l=(a/h)*b;
	 
	  System.out.println(l+" "+h);
	 
	  
      }
	
	/* static long hcf(long a, long b)
	{
		if(a==b)
			return a;
		else if(a>b)
			return hcf(a-b,b);
		else
			return hcf(a,b-a);
		
}*/
}