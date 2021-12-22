import java.util.HashMap;
class stc
{
	public static void main(String[] args) {
		String s="what what is is";
		count(s);
	}
	public static void count(String str)
	{
		HashMap<String,Integer>hm=new HashMap<>();
		String []s=str.split(" ");
	    for(String temp: s)
		{
			if(hm.get(temp) !=null)
			{
				hm.put(temp,hm.get(temp)+1);
			}
			else
			{
				hm.put(temp,1);
			}
			System.out.println(hm);
		}
	}
}