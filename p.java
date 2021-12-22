import java.util.*;
class p
{
	public static void main(String[] args) {
		int []a={2,4,5,6,7,1,5};
		int m=2;
		Arrays.sort(a);
		int n=a.length-1;
	    int res=1;
	    while(m>0)
	    {
	    	res=res*a[n];
	    	m--;
	    	n--;
	    }
	    System.out.println(res);

	}
}