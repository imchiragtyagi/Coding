import java.util.*;
class wave
{

	public static void main(String[] args) {
		int []a={3,5,6,1,2,9,8};
		wavesort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void wavesort(int []a)
	{
		for (int i=0;i<a.length-1 ;i++ ) {
			for (int j=1;j<a.length-i ;j++ ) {
				if(a[j-1]>a[j])
				{
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		for(int i=0;i<a.length-1;i=i+2)
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
	}
}