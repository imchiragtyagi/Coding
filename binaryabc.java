class binaryabc
{
	public static void main(String[] args) {
		int a=111001;
		int decimal=0;
		int i=0;
		while(a>0)
		{
			int rem=a%10;
			decimal+=rem*Math.pow(2,i);
			a=a/10;
			i++;
		}

		System.out.println(decimal);
	}
}