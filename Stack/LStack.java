class LStack
{
	private Node top;
	private int size;


	public void push(int val)
	{
		Node node=new Node(val);
		node.next=top;
		top=node;
		size++;
	}

	public int pop()
	{
		Node temp=top;
		top=temp.next;
		size--;
		return temp.value;

	}
	public void display()
	{
		Node temp=top;
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}
	}



	private class Node{
		private int value;
		private Node next;

		public Node(int value)
		{
			this.value=value;
		}
		public Node(int value,Node next)
		{
			this.value=value;
			this.next=next;
		}
	}


	public static void main(String[] args) {


		LStack l=new LStack();

		l.push(4);
		l.push(6);
		l.push(10);

		l.display();
		l.pop();
		l.display();
		
	}
}