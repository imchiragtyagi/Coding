class pp1
{
	public static void main(String[] args) {
		for (int i=1;i<=4 ;i++ ) {
			
			if(i==1)
			{
				for (int j=1;j<=6 ;j++ ) {
					System.out.println("*");
				}
			}
			if(i==4)
			{
				for (int j=1;j<=6 ;j++ ) {
					System.out.println("*");
				}
			}
			 if(i==2)
			{
				for (int j=1;j<=6 ;j++ ) {
					if(j==3||j==4)
					{
						System.out.println(" ");
					}
					else
					{
						System.out.println("*");
					}}
				if(i==3)
			    {
				for (int j=1;j<=6 ;j++ ) {
					if(j==1||j==6)
					{
						System.out.println("*");
					}
					else
					{
						System.out.println(" ");
					}
					
				}
				System.out.println();
			}
			
		}
	}
}
}