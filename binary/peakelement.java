	//bitonic array is something whose value will 
//first increrase then decrease

class peakelement
	{
		public static void main(String[] args) {
			int []a={0,1,0};
			System.out.println(newbinarysearch(a));
		}
	



	public static int newbinarysearch(int  []a )
	{ 
		//no target is provided
		int start=0;
		int end=a.length-1;

while(start<end)
	 {

	 	 int mid=start+(end-start)/2;
	 	 //no target is provided then these value will help
	 	 //in binary search.
	 	if(a[mid]>a[mid+1])

	 	{
	 		//you are in dec part of array
	 		//this may be answer(this is why end!=mid-1) but look at left


	 		end=mid;
	 	}
	 	else 
	 		//(a[mid]<a[mid+1])[condition]
	 	{
	 		//you are in increasing part of array
	 		//look at right.
	 		start=mid+1;
	 	}
	 }
	 	return start;//can also return end bc both are equal
	 
	}
}


	