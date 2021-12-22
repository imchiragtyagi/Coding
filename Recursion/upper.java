import java.util.*;
import java.lang.*;
class upper
{
	public static void main(String[] args) {
		String s="ajfaksl";
		s=s.toLowerCase();
		StringBuilder p=new StringBuilder();
		char []a=s.toCharArray();
		for(int i=0;i<s.length();i=i+1){
			char c=a[i];
			if(i%2==0)
			{
				c=Character.toUpperCase(c);
				p.append(c);
	
			}else{
			p.append(c);
		}
	

		}
		System.out.println(p);

	}
}