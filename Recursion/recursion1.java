class recursion1
{
	public static void main(String[] args) {
		int n=5;
		print(n);
	}
	public static void print(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);//printing while putting in the stack;;
		print(n-1);
		//printing while empting the stack
		System.out.print(n+" ");

	}
}