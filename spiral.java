import java.util.*;
class spiral
{
  public static void main(String args[])
  {
    Scanner as=new Scanner(System.in);
	int n=as.nextInt();int k=0;
	int arr[][]=new int[n][n];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			arr[i][j]=as.nextInt();
		}
	}
			
	if(n%2==0)
	k=1;
   int j,r;int found=0;
	for(int i=0;i<=n/2;i++)
	{
		  if(i==0)
			  j=0;
		  else
			  j=i-1;
		for( ;j<n-i;j++)
	    {
			
			if(k==1)
			{
				
				if(i==n/2&&j==(n/2)-1){
					found=1;
					break;
				}
				System.out.print(arr[i][j]+" ");
			}
			 if(k==0)
			{
				System.out.print(arr[i][j]+" ");
				if(i==n/2&&j==n/2){
					found=1;
					break;
				}
			}
			
			
				
		}
			int m=j-1;int c=0;
			if(found!=1){
			for( r=i+1;r<n-i;r++)
				System.out.print(arr[r][m]+" ");
			for( c=n-2-i;c>=i;c--)
				System.out.print(arr[r-1][c]+" ");
			for(int v=r-2;v>=i+2;v--)
				System.out.print(arr[v][c+1]+" ");
			}
		}
  }
}  
		