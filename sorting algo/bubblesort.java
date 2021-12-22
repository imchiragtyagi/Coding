import java.util.*;
public class bubblesort
{
	public static void main(String[] args) {
		int []a={1,4,3,2,8,5};
		//calling function
		bubblesort(a);
		System.out.println(Arrays.toString(a));//printing array
	}
	public static void bubblesort(int []a)
	{
		boolean b;//if array is already sorted we are checking that condition here.
		for (int i=0;i<a.length ;i++ )//outer loop,that helps in not checking the sorted list
		 {
			b=true;
			for (int j=1;j<a.length-i ;j++ ) //inner loop ,actually doing sorting;
			{
				if(a[j-1]>a[j])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					b=false;
				}
				
			}
			if(b)//it means if b is true 
			{
				break;
			}
			
		}
	}
}