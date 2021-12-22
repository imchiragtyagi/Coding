class decimalb
{
	public static void main(String[] args) {
		int n=57;
		int []binary=new int[10];
		int i=0;
		while(n>0)
		{
			int rem=n%2;
			binary[i++]=rem;
			n/=2;


		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(binary[j]);
		}

	}
}