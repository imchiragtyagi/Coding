import java.util.*;
class delo
{
	public static void main(String[] args) {
		int []a={1,3,4,5,6,7,8};
		int i=0;
		int j=0;
		int []b={2,7,9,5};
		int []c=new int[a.length+b.length];
		while(i<c.length)
		{
			if(j<Math.min(a.length,b.length))
			{
				c[i]=a[j];
				c[++i]=b[j];
				j++;
			}
			else if(a.length>b.length)
			{
				c[i]=a[j];
				j++;
			}
			else if(a.length<b.length)
			{
				c[i]=b[j];
				j++;
			}
			i++;	
		}

	    System.out.println(Arrays.toString(c));
}
	}
