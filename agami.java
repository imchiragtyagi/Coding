class agami
{
	public static void main(String[] args) {
		int n=7;
		int c=2;
		int b=0;
		while(c*c<=n)
		{
			if(n%c==0)
			{
				b=1;
				break;
			}
			c=c+1;
		}
		if(b==0){
		  System.out.println("prime");
	     }
	     else
	     {
	     	System.out.println("not prime");
	     }
	 }
}