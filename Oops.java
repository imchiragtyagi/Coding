class duplicatele
{
	public static void main(String[] args) {
		int []a={1,2,5,6,4,6,2,5};
		System.out.println(Arrays.toString(duplicate(a));
	}
	public static int duplicate(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			 for(int j=i+1;j<a.length;j++)
			 {
			 	if(a[i]>a[j])
			 	{
			 		swap(a[i],a[j])
			 	}
			 }
		}
		return a;

	}

	public static void swap(int start,int last)
	{
		int temp=start;
		start=last;
		last=temp;
	}
}
