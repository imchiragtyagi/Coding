class sumdigit
{
	public static void main(String[] args) {
		int n=12345;
		int a=sum(n);
		int b=product(n);
		System.out.println(a);
		System.out.println(b);
	}
	public static int sum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return n%10+sum(n/10);
	}
	public static int product(int n)
	{
		if(n%10==n)
		{
			return n;
		}
		return n%10*product(n/10);
	}
}