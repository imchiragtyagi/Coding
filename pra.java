import java.util.*;
class pra
{
	public static void main(String[] args) {
		int []a={1,4,5,6,7,2,3,4};
		int count=0;
		ArrayList<String>b=new ArrayList<>();
		for(int i=0;i<a.length-1;i++)
		{
			count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==a[i])
				{
					count=count+1;
				}
			}
			if(!b.contains(a[i]+"->"+count))
			{
				b.add(a[i]+"->"+count);
			}
		}
		System.out.println(b);
		
	}
}