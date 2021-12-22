class sortcheck
{
	public static void main(String[] args) {
		int []a={1,2,6,4,5};
		System.out.println(check(a,0));
	}
	static boolean check(int []a,int i)
	{
		if(i==a.length-1)
		{
			return true;
		}
         return a[i]<a[i+1]&& check(a,i+1);
	}
}

//there is not a concept in java pass by reference but it is
//pass by vakue of the reference.

//if by chance the object is changed by any one reference then 
//it is visible to all .