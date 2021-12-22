class Queue
{
	int[]queue=new int[5];
	int front;
	int rear;
	int size;

	public Queue()
	{
		front=0;
		rear=0;
		size=0;

	}
	public void enqueue(int val)
	{
		queue[rear]=val;
		rear++; 
		//circular -rear=(rear+1)%5
		size++;
	}
	public int dequeue()
	{
		int data=queue[front];
		front++;
		//circular -front=(front+1)%5;
		size--;

		return data;
	}
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(queue[front+i]);
			//System.out.println(queue[(front+i)%5]);
		}
	}
	public static void main(String[] args) {
		Queue q=new Queue();
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(8);
		q.enqueue(1);
		q.dequeue();
		System.out.println(q.dequeue());
		q.enqueue(5);

		q.display();

		
	}
}