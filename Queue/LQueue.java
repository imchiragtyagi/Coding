class LQueue
{
	private Node front,rear;

	public LQueue()
	{
		this.front=this.rear=null;
	}


	public void enqueue(int value)
	{
		Node temp=new Node(value);
		if(rear==null)
		{
			this.front=this.rear=temp;
			return;
		}
		this.rear.next=temp;
		this.rear=temp;
	}

	public void dequeue()
	{
		//Queue is empty
		if(this.front==null)
		{
			return;
		}
		//store previous front and move ahead
		Node temp=this.front;
		this.front=this.front.next;
		//if front become null by removing then changes rear also
		if(this.front==null)
		{
			this.rear=null;
		}

	}

	public void display()
	{
		Node temp=front;
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}
	}




private class Node
{
	private Node next;
	private int value;

	public Node(int value)
	{
		this.value=value;
		this.next=null;
	}


	
}
public static void main(String[] args) {
	LQueue q=new LQueue();

	q.enqueue(2);
	q.enqueue(3);
	q.enqueue(4);
	q.display();
	q.dequeue();
	q.display();
	
}
}
//enqueue always happen at the rear side
//dequeue always happen at the front side