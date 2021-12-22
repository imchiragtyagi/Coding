class missingnumber
{
	public static void main(String[] args) {
		
	
	int []a={1,0,4,2};
	int n=4;
	int b=missingnumber(a,n);
	System.out.println(b);

}

public static int missingnumber(int []a,int n);
{
	int i=0;
	while(i<a.length)
	{
		int index=a[i];
		if(a[i]==n)
		{
			i++;
			continue;
		}
		else if(a[i]!=i)
		{
			swap(a,i,index);
		}
		else
		{
			i++;
		}


	}
	for (int j=0;j<a.length ;j++ ) {
		if(a[j]!=j)
		{
			return j;

		}

		
	}

	return n;
}
public static void swap(int []a,int first,int second)
	{
		int temp=a[first];
		a[first]=a[second];
		a[second]=temp;
	}
}