class cellingchar 
{
	public static void main(String[] args) {
		 char [] a={'a','c','f'};
		char target='g';
		char ans=cellingchar(a,target);
		System.out.println(ans);

	}
	public static char cellingchar(char []a ,char target)
	{
	 int start=0;
	 int end=a.length-1;
	 int mid=0;
while(start<=end)
	 {
	 	 mid=(start+end)/2;
	 	if(target>a[mid])
	 	{
	 		start=mid+1;
	 	}
	 	else
	 	{
	 		end=mid-1;
	 	}

	 
	
	}
	 return a[start%a.length] ;
	}
	//or return start ;
	//if(start==a.length)
    //return a[0];


}