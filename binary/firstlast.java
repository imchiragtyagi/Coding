import java.util.Arrays;
class firstlast
{
	public static void main(String[] args) {
		 int [] a={1,2,3,3,3,5,6};
		int target=3;
		}
		
	

	
	public static int[] position(int []a,int target)
	{
		int []ans={-1,-1};
		int start=firstlast(a,target,true);
		int end=firstlast(a,target,false);
		ans[0]=start;
		ans[1]=end;
		return ans;

	}
	public static int firstlast(int  []a ,int  target,Boolean firstindex)
	{ 
	 int ans=-1;
	 int start=0;
	 int end=a.length-1;
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
	 		ans=mid;
	 		if(firstindex)
	 		{
	 			end=mid-1;
	 		}
	 		else
	 		{
	 			start=mid+1;
	 		}


	 	}

	 
	
	}
	 return ans ;
	}
} 


