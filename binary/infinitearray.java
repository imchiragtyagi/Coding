// i am using the chunk(new size array ,from the infinite array) approach here 
//where in each finding i am going to traversing array size for binary search
class infinitearray
	{
		public static void main(String[] args) {
			int []a={1,5,6,9,10,12,19,21,25,28,30,37,47,41};
			int target=30;
			System.out.println(infinite(a,target));
		}

	public static int infinite(int []a,int target){
		int start=0;
		int end=1;
		//increase the value of start and end till this condition
		while(target>a[end])
		{
			int temp=end+1;
			//formulae for new chunk:
			end=end+(end-start+1)*2;
			start=temp;
		}
		return binarysearch(a,target,start,end);
	}

	public static int binarysearch(int  []a ,int  target,int start,int end)
	{ 
while(start<=end)
	 {
	 	 int mid=start+(end-start)/2;
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
	 		//ans found
	 		return mid;
	 	}

	 }
	 return -1;

	}
}



