import java.util.*;
class hilo
{
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		int x=0;
		int y=0;
		int []a={0,4,3,2,1,6,8,115};
		int sum=0;
		for (int i=0;i<a.length-1 ;i++ ) {
			sum=0;
			x=0;
			y=0;

			for (int j=0;j<a.length-1 ;j++ ) 
			{
				if(a[i]<a[j]);
				{
					x=a[j];
					break;
				}
			}
				for (int k=0;k<a.length-1 ;k++ ) {
					
				if(a[i]>a[k]);
				{
					y=a[k];
					break;
				}

				}
				sum=x+y;

				list.add(sum);

			}
			System.out.println(list);
			
		}

		
	}
