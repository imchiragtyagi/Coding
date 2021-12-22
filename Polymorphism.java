class Polymorphism
{
	public static void main(String[] args) {
	methodoverloading c=new methodoverloading();
	System.out.println(c.sum(45,56));
	Inherit2 p=new Inherit2();
	p.greet();
		
	}
}
class methodoverloading
{
	int a;
	int b;
	int c;
	int sum(int a,int b)
	{
		return a+b;
	}
	int sum(int a,int b,int c)
	{
		return a+b+c;
	}

}
class  Inherit
{
	void greet()
	{
		System.out.println("hey Inherit");
	}
}
class Inherit2 extends Inherit{
	@Override//annotation to check overriding is happening or not.
	void greet()
	{
		System.out.println("hey Inherit2");

	}
}