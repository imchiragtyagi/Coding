import java.util.*;
class duplicatele
{
	public static void main(String[] args) {
		int []a={1,2,5,6,4,6,2,5};
		System.out.println((getfreq(a)));
	}
	public static ArrayList<Integer> getfreq(int []a)
	{
	     ArrayList<Integer> p=new ArrayList<>();
		 for (int i=0;i<a.length ;i++ ) {
		 	int count=0;
		 	for (int k=0;k<a.length ;k++ ) {
		 		if(a[i]==a[k])
		 		{
		 			 count++;
		 		}
		 		



		 		
		 	}
		 	if(!p.contains(a[i])){
		 		p.add(a[i]);
		 	}
		 	
		 }
		 return p;
	}
	
}


