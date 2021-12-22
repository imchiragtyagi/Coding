class Rotatebinary{
	public static void main(String[] args) {
		int []a={5,6,7,8,9,1,2,3,4};
		System.out.println(search(a,4,0,a.length-1));

	}
	public static int search(int []a,int target,int start,int end)
	{
		if(start>end)
		{
			return -1;
		}
		int mid=start+(end-start)/2;
		if(a[mid]==target)
		{
			return mid;
		}
		if(a[start]<=a[mid]){
			if(target>=a[start]&&target<=a[mid]){ 
				return search(a,target,start,mid-1);
			}else{
				return search(a,target,mid+1,end);
			}
	}
	if(target>=a[mid]&&target<=a[end])
	{
		return search(a,target,mid+1,end);
	}
	return search(a,target,start,mid-1);



	}
}