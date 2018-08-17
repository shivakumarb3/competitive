import java.util.*;
class bitswap{
public static void main(String args[])
{
Scanner as=new Scanner(System.in);

   int n=as.nextInt();
   for(int i=0;i<=30;i+=2)
   {
      int c1=checkbit(n,i);
	  int c2=checkbit(n,i+1);
	  //int p=(int)Math.pow(2,31)-1;
	  if(c1>c2){
	  n=n|(1<<(i+1));
     n=n-(int)Math.pow(2,i);
	  }
	  if(c1<c2){
	  n=n|(1<<i);
      n=n-(int)Math.pow(2,i+1);
	  }
	  
	}
	System.out.println(n);
}
	
	static int checkbit(int n,int i)
	{
	    if(((n>>i)&1)==1)
		  return 1;
		  else
		  return 0;
		  }
		}  