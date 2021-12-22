class fibpattern
{
	 public static void main(String[] args) {
	 	int n=3;
	 	int m=0;
	 	for (int i=1;i<=n;i++ ){
	 		for(int j=0;j<=7;j++)
	 		{
	 			if(j!=0&&j%2!=0)
	 			{
	 				System.out.print("*");
	 			}
	 			else{
	 				int a=(int)((Math.pow(((1+Math.sqrt(5)) /2), m)-  Math.pow(((1-Math.sqrt(5)) /2), m))/Math.sqrt(5));
	 				System.out.print(a);
	 				 m++;
	 				}

	 		}
	 		System.out.println();

	 		
	 	}
	 }
}	