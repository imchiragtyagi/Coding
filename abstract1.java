abstract class chirag
{
	//abstract void greet();
	abstract void routine();
}
class chi extends chirag{
	public static void greet()
	{
		System.out.println("hey i am here");
	}
	void routine()
	{
		System.out.println("i wake up at 10");
	}
}

class abstract1{
	public static void main(String[] args) {
		chi a=new chi();
		a.greet();
		a.routine();
	}
}