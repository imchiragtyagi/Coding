class factorial
{
	public static void main(String[] args) {
		int n=5;
		  factorial a=new factorial();
		int b=factorial(n);
		System.out.println(b);
}
	public int factorial(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		return n*factorial(n-1);
	}

}