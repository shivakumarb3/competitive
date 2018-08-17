import java.util.*;
class power
{
public static void main(String args[])
{
  Scanner as=new Scanner(System.in);
  long m=(long)1e7;
  long a=as.nextLong();
  long b=as.nextLong();
  a=a%m;long ans=1;long x=a;
    while(b!=0)
	{
	   long check=	b&(long)1;
	  if(check==1)
		  ans=(ans%m*x)%m;
	  x=x*x;
	  b=b>>1;
	}
	System.out.println(ans);
}
}
	