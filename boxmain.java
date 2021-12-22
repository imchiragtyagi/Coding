//INHERITANCE EXAMPLE
//multilevel inherirance


class box
{
	int length;
	int width;
	int breadth;
	box()
	{
		this.length=-1;
		this.width=-1;
		this.breadth=-1;
	}
}
class boxprice extends box
{
	int price;
	boxprice(int price)
	{
		super();
		this.price=price;
	}
}
class boxpricemax extends boxprice
{
	int maxprice;
	boxpricemax(int price,int maxprice){
	super(price);
	this.maxprice=maxprice;
	}
}

class boxmain
{
	public static void main(String[] args) {
		boxprice p1=new boxprice(2500);
		System.out.println(p1.length);
		boxpricemax p2=new boxpricemax(3000,5000);
			System.out.println(p2.maxprice);

		
	}
}
//simple inherirance


/*class box
{
	int length;
	int width;
	int breadth;
	box()
	{
		this.length=-1;
		this.width=-1;
		this.breadth=-1;
	}
}
class boxprice extends box
{
	int price;
	boxprice(int price)
	{
		super();
		this.price=price;
	}
}


class boxmain
{
	public static void main(String[] args) {
		boxprice p1=new boxprice(2500);
		System.out.println(p1.length);
		
	}
}
*/