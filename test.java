class test
{
  public static void main(String args[])
  {
     int n=5;
	 for(int i=1;i<=n/2+1;i++)
	 {
		 for(int j=n/2;j>=i;j--)
		System.out.print(" ");
	    for(int k=1;k<=(2*i-1);k++)
		{
			  if(k==1||k==2*i-1)
				  System.out.print("*");
			  else
				  System.out.print(" ");
			  
		}
		System.out.println();
	 }
	 for(int i=n/2;i>=1;i--)
	 {
		 for(int j=n/2;j>=i;j--)
		System.out.print(" ");
	    for(int k=1;k<=(2*i-1);k++)
		{
			  if(k==1||k==2*i-1)
				  System.out.print("*");
			  else
				  System.out.print(" ");
			  
		}
		System.out.println();
	 }
  }
}  
	 
	
		 
		  