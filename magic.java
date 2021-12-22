class magic
{
	public static void main(String[] args) {
		int n=5;
		int []a={5,4,3,2,1};
		int m=0;
		int p=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					swap(a[i],a[j]);
					m+=a[j];
				}
				else
				{
					p+=a[i];
				}
			}
		}
		System.out.println(p-m);
	}

	public static void swap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
	}
}