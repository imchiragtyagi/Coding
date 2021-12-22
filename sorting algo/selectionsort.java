/* 
Steps tp be folLowed:
first we will find the max index 
then put that max index element in the last of array
then again follow the same procedure but for array.length-i-1;
because from last array become sorted
*/
import java .util.*;
class selectionsort
{
	public static void main(String[] args) {
		int []a={5,6,1,2,3,0};
		selectionsort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void selectionsort(int []a)
	{
		for (int i=0;i<a.length ;i++ ) {
			int last =a.length-i-1;
			int max=getmaxindex(a,0,last);//finding max index
			swap(a,max,last);//swapping with the 
			
		}
	}
  public static int	getmaxindex(int []a,int start,int last)
  {
  	int max=start;
  	for (int i=start;i<=last ;i++ ) {
  		if(a[i]>a[max])
  		{
  			max=i;
  			
  		}

  		
  	}
  	


  	return max;
  }
  public static void swap(int []a,int start,int last)
  {
  	int temp=a[start];
  	a[start]=a[last];
  	a[last]=temp;
  }
}

