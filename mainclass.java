import java.util.Scanner;

public class mainclass {
	
	static double binomialCoeff(int n, int k)
    {
    double C[][] = new double[n+1][k+1];
    int i, j;
    for (i = 0; i <= n; i++)
    {
        for (j = 0; j <= min(i, k); j++)
        {
            if (j == 0 || j == i)
                C[i][j] = 1;
            else
                C[i][j] = C[i-1][j-1] + C[i-1][j];
          }
     }
      
    return C[n][k];
    }
 
    static double min(double a, double b)
    {
    return (a<b)? a: b; 
    }
	
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	int t=0,n=0;
	t=s.nextInt();
	for(int i=0;i<t;i++)
	{
		n = s.nextInt();
		if(n==1)
			System.out.println(1);
		else if(n==2)
			System.out.println(2);
		else if(n==3)
			System.out.println(5);
		else
		{
			double ans=0;
			double maxzeroes = 0;
			maxzeroes = Math.ceil((double)n/2);
			//System.out.println(maxzeroes);
			for(int k=2;k<=maxzeroes;k++)
			{
				int ones = n-k;
				int zeroes = k;
				ans += binomialCoeff(ones+1,zeroes);
				//System.out.println("ans "+k+" is= "+ans);
			}
			ans+=(1+n);
			System.out.println(ans);
		}
	}
	s.close();
}
}