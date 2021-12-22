import java.util.*;
class Quicksort
{
	public static void main(String[] args) {
		int []a={5,4,3,2,1};
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));

	}
	public static void sort(int []a,int low,int hi)
	{
		if(low>=hi)
		{
			return;
		}
		int s=low;
		int e=hi;
		int m=s+(e-s)/2;
		int pivot=a[m];
		while(s<=e)
		{
			while(a[s]<pivot)
		    {
		    	s++;
		    }
		    while(a[e]>pivot)
		    {
		    	e--;
		    }
		    if(s<=e)
		    {
		    	int temp=a[s];
		    	a[s]=a[e];
		    	a[e]=temp;
		    	s++;
		    	e--;

		    }
		}
		sort(a,low,e);
		sort(a,s,hi);
	}
}