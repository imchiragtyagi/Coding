class pp
{
	public static void main(String[] args) {

int n=54;
int s=0;
int e=n;
while(s<e)
{
	int m=(s+e)/2;
	if(m*m==n)
	{
		System.out.println(m);
		break;
	}
	if(m*m>n)
	{
		e=e-1;
	}
	else
	{
		s=s+1;
	}

}



	 }
}