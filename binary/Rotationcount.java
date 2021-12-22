//find the rotation count in the Rotated sorted array
//1.Brute -force appproach is veryb simple ,just linear search.
class Rotationcount
{
	public static void main(String[] args) {
		int []a={4,5,6,7,0,1,2};
		System.out.println(peakindex(a));
		//int ans=findPivot(a)+1;
			//System.out.println(ans);
		

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
	 	return start +1;//can also return end bc both are equal
	 
	}
	}

/* 
pivot method :	public static int findPivot(int []a)

 	{
 		int start=0;
 		int end=a.length-1;
 		while(start<=end){
 			int mid=start+(end-start)/2;
 			//4 cases concepts will  use:
 			//case1:
 			if(mid<end&&a[mid]>a[mid+1])//mid<end so that out of bound
 			{
 				return mid;
 			}
 			//case 2:
 			if(mid>start&&a[mid]>a[mid-1])
 			{
 				return mid-1;
 			}
 			//Casse 3:
 			if(a[mid]<=a[start])
 			{
 				end=mid-1;
 			}
 			//case 4:
 			else
 			{
 				start=mid+1;
 			}

 		}
 		return -1;

 }
