class pascal
{
	public static void main(String[] args) {
	
	int n=5;
	int number=1;
	int spaces=n;
	for (int i=0;i<n ;i++ ) {
		for (int s=1;s<=spaces ;s++ ) {
			System.out.print(" ");
		}
		//number=1;
			
		
		for (int j=0;j<=i ;j++ ) {
			//System.out.print(number+" ");
			//number=number*(i-j)/(j+1);
			System.out.print("* ");
			
		}
		spaces--;
		System.out.println();
		
}	

}
}