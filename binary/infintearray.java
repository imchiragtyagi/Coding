
	class infinitearray

	{
		public static void main(String[] args) {
			int a={1,5,6,9,10,12,19,21,25,28,30,37,47,41}
			int target=30;
			System.out.println(infinite(a,target));
		}

	public static int infinite(int []a,int target){
		int start=0;
		int end=1;
		while(target>a[end])
		{
			temp=start+1;
			end=end+(end-start+1)*2;
			start=temp;
		}
		return binarysearch(a,target,start,end);
	}
	public static int binarysearch(int  []a ,int  target,int start,int end)
	{ 
while(start<=end)
	 {
	 	 int mid=start+(start-end)/2;
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

	}



