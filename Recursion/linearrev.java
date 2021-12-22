class linearrev
{
	public static void main(String[] args) {
		int []a={1,2,3,4,9,8};
		System.out.println(search(a,0,20));
	}
	static int search(int []a,int index,int target)
	{
		if(a[index]==target)
		{
			return index;
		}
		else if(index==a.length-1)
		{
			return -1;
		}
		return search(a,index+1,target);
	} 
}