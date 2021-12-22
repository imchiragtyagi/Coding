	//bitonic array is something whose value will 
//first increrase then decrease

class mountainsearch
	{
		public static void main(String[] args) {
			int []a={0,1,2,1,0};
			int target=2;
			System.out.println(targetindex(a,target));
		}


		public static int targetindex(int []a,int target)
		{
			int peak=peakindex(a);
			int firstTry=orderagnostic(a,target,0,peak);
			if(firstTry!=-1)
			{
				return firstTry;
			}
			return orderagnostic(a,target,peak+1,a.length-1);

		}

	



	public static int peakindex(int  []a )
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
	//now, we will check whether the array is in ascending or descending order

public static int orderagnostic(int []a,int target,int start,int end)
{
	boolean isAsc=a[start]<a[end];
	while(start<=end)
	{
       int mid=start+(end-start)/2;
       if(a[mid]==target)
       {
       	return mid;
       }
       if(isAsc){
       	if(target<a[mid])
       	{
       		end=mid-1;
       	}
       	else
       	{
       		start=mid+1;
       	}
       }
       else
       {
       	if(target>a[mid]){
       	end=mid-1;
       }
       else
       {
       	start=mid+1;
       }
       }
	}
	return -1;


	

}
}


	