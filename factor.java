import java.util.*;
class factor
{
	public static void main(String[] args) {
		int n=40;
		factor(n);
	}
	public static void factor(int a)
	{
		for(int i=1;i<=Math.sqrt(a);i++)
		{
			if(a%i==0)
			{
				if(a%i==i)
				{
					System.out.println(i);
				}
				else
				{
					System.out.println(i+" "+a/i);
				}
			}
		}
	}
}