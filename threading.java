/*class Mythread implements Runnable
{
	public void run()
	{
		//task
		System.out.println("hi");  

	}
}
class threading
{
	public static void main(String[] args) {
		Mythread t=new Mythread();
		Thread th=new Thread(t);
		th.start();
	}
}*/

class Mythread extends Thread
{
	public void run()
	{
		//task
		System.out.println("hi");  

	}
}
class threading
{
	public static void main(String[] args) {
		//Mythread t=new Mythread();
		Mythread th=new Mythread();
		th.start();
		th.setName("chi");
		String name=th.getName();
		System.out.println(name);
		System.out.println(th.getId());
	}
}