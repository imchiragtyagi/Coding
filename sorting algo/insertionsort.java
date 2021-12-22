import java .util.*;
class insertionsort
{
	public static void main(String[] args) {
		int []a={5,6,1,2,7,0};
		insertionsort(a);
		System.out.println(Arrays.toString(a));
	}

public static void insertionsort(int []a)
{
	for(int i=0;i<=a.length-2;i++)//we go till a.length-2 because j is always i+1 then it will give out of bound
	{
		for (int j=i+1;j>0 ;j-- ) {
	   if(a[j]<a[j-1])
		{
		
		swap(a,j,j-1);

		}
		else
		{
			break;//we are breaking loop here because left hand side is sorted.
		}

		}
	}
}
//swap method for sorting
public static void swap(int []a,int start,int last)
{
	int temp=a[start];
  	a[start]=a[last];
  	a[last]=temp;
	}
}