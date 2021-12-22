 public class RBS
 {
 	public static void main(String[] args) {
 		int []a={4,5,6,7,0,1,2};
 		int target=7;
 		System.out.println(pivotBinarySearch(a,target));
 	}

 	//main working area
 	public static int  pivotBinarySearch(int []a,int target)
 	{
 		int pivot=findPivot(a);
 		//if you don't have pivot means array not rotated;
 		//simple binary search
 		if(pivot==-1)
 		{
 			binarysearch(a,target,0,a.length-1);
 		}
 		//if pivot is found,means two ascending sorted arrays;
 		//case 1:for ans finding
 		if(a[pivot]==target)
 		{
 			return pivot;
 		}
 		//case 2:
 		if(target>a[0])
 		{
 			return binarysearch(a,target,0,pivot-1);
 		}//case 3:
 			return binarysearch(a,target,pivot+1,a.length-1);


 	}
 	//helper 1
 	public static int findPivot(int []a)

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
 //helper 2
 public static int binarysearch(int []a,int target,int start,int end)
 {
 	while(start<=end)
 	{
 		int mid=start+(end-start)/2;
 		if(target==a[mid])
 		{
 			return mid;
 		}
 		else if(a[mid]<target)
 		{
 			start=mid+1;

 		}
 		else
 		{
 			end=mid-1;
 		}
 	}
 	return -1;
 }
 	}
