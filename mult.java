import java.util.*;
class mult
{
  public static void main(String args[])
  {
     Scanner as=new Scanner(System.in);
	 int n1,m1,n2,m2;
	 n1=as.nextInt();
	 m1=as.nextInt();
	 
	 int a[][]=new int[n1][m1];
	 
	 for(int i=0;i<n1;i++)
	 {
	    for(int j=0;j<m1;j++)
		{
			a[i][j]=as.nextInt();
		}
	 }
	  n2=as.nextInt();
	 m2=as.nextInt();
	 int b[][]=new int[n2][m2];
	 for(int i=0;i<n2;i++)
	 {
	    for(int j=0;j<m2;j++)
		{
			b[i][j]=as.nextInt();
		}
	 }
	 if(m1==n2){
	 int c[][]=new int[n1][m2];
	 for(int i=0;i<n1;i++)
	 {
		 for(int j=0;j<m2;j++)
		 {
			 for(int k=0;k<n2;k++)
			 {
				 c[i][j]=c[i][j]+a[i][k]*b[k][j];
				
			 }
			 System.out.print(c[i][j]+" ");
		 }
		 System.out.println();
	 }
	 }
  }
}  
				 
		