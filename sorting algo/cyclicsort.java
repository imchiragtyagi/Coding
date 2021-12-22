import java .util.*;

class cyclicsort
{
	public static void main(String[] args) {
		int []a={5,4,1,3,2};//cycliccort is used only in 1 to n continous elemet is given;
		cyclicsort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void cyclicsort(int []a)
	{
		int i=0;
		while(i<a.length)
		{
			int correctindex=a[i]-1;//because array index start from zero.
			
			if(a[i]!=a[correctindex])
			{             
				swap(a,i,correctindex);
			}
			else
			{
				i++;
			}
		}
	}
	public static void swap(int []a,int first,int second)
	{
		int temp=a[first];
		a[first]=a[second];
		a[second]=temp;
	}
}