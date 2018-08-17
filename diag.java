import java.util.*;

   class diag{
	   public static void main(String args[])
	   { 
	   Scanner as=new Scanner(System.in);
	      int n=as.nextInt();
		  int arr[][]=new int[n][n];
		  for(int i=0;i<n;i++)
		  {
			  for(int j=0;j<n;j++)
			  {
				  arr[i][j]=as.nextInt();
			  }
		  }
		  int sum2[]=new int[n-1];
		 for(int i=0;i<n;i++)
		 {
			 int sum1=0;
			for(int k=0;k<=i;k++)
			{
				for(int j=n-1;j>=(n-1)-i;j--)
				{
					if(j==((n-1)-i+k))
					{
						sum1=sum1+arr[k][j];
						if(i!=n-1)
							sum2[i]=sum2[i]+arr[j][k];
					}
				}
			}
		System.out.print(sum1+" ");
		
		 }
		 for(int i=n-2;i>=0;i--)
			 System.out.print(sum2[i]+" ");
	   }
   }
	     
		   