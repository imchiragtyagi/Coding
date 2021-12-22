class cellingbinary
{
	public static void main(String[] args) {
		int [] a={1,2,5,6,7};
		int target=4;
		int ans=celling(a,target);
		System.out.println(ans);

	}
	public static int celling(int []a ,int target)
	{
		//sort(a);
	 int start=0;
	 int end=a.length-1;
	 int mid=0;
	 //edge case
	 if(target>a[a.length-1])
	 {
	 	return -1;
	 }
	 while(start<=end)
	 {
	 	 mid=(start+end)/2;
	 	if(target>a[mid])
	 	{
	 		start=mid+1;
	 	}
	 	else if(target<a[mid])
	 	{
	 		end=mid-1;
	 	}
	 	else
	 	{
	 		return mid;
	 	}
	 }

	 
	 return start;
	}

	/*public static int[] sort(int []a)
	{
		for (int i=0;i<a.length ;i++ ) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		return  int[] a;
	}*/

}