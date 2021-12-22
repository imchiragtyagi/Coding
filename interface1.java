interface a{
void  chirag();
}
interface b{
void arpit();
}
class greet implements a,b{
	@Override
	 public void chirag()
	{
		System.out.println("hey");
	}
	public void arpit()
	{
		System.out.println("hello");
	}

}
class interface1{
	public static void main(String[] args) {
		greet obj=new greet();
		obj.chirag();
		obj.arpit();
	}
}