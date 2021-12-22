class dt
{
	public static void main(String[] args) {
		int a=7;
		int b=5;
		int c=hcf(a,b);
		System.out.println(c);

	}
	public static int  hcf(int a,int b)
	{

		if( b!=0)
		return hcf(b,a%b);
		else
		return a;

	}
}