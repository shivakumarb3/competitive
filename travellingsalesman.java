import java.util.*;
class travellingsalesman
{
	 public static void main(String args[])
	 {
		 Scanner as=new Scanner(System.in);
		 int n=as.nextInt();
		 //weigt matrix
		 int weight[][]=new int[n][n];
		 int dp[][]=new int[1<<n][n];
		 for(int i=0;i<(1<<n);i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 dp[i][j]=-1;
			 }
		 }
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				  weight[i][j]=as.nextInt();
			 }
		 }
		
		 System.out.println(tspfind(0,weight,dp,0,n));
	 }
	static int tspfind(int source,int weight[][],int dp[][],int mask,int n)
	{
		if(mask==(1<<n)-1)
			return weight[source][0];
		if(dp[mask][source]!=-1)
			return dp[mask][source];
		int ans=(int)1e9+7;
		int cans=0;
		
		for(int i=0;i<n;i++)
		{
			
			if((mask & (1<<i))==0){
				if(dp[mask][source]==-1)
			cans=weight[source][i]+tspfind(i,weight,dp,(mask | (1<<i)),n);
			//System.out.println(cans);
			ans=min(ans,cans);
				
			
			}
		}
		dp[mask][source]=ans;
		return ans;
	}
   static int min(int a,int b)
   {
	   if(a<b)
		   return a;
	   else 
		   return b;
   }
}
			
			
