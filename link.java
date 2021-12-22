class LL
{
	private Node head;
	private Node tail;

	private int size;

	public LL()
	{
		this.size=0;
	}

	public void insert(int value)
	{
		Node node=new Node(value);
		node.next=head;
		head=node;

		if(tail==null)
		{
			tail=head;
		}

	}
	public void display()
	{
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.value+"->");
			temp=temp.next;
		}
		System.out.println("end");
	}





	class Node{
		private Node next;
		private int value;

		public Node(int val)
		{
			this.value=val;
		}

		public Node(int val,Node next)
		{
			this.value=val;
			this.next=next;
		}
	}
}

class Link
{
	public static void main(String[] args) {
		LL list=new LL();
		list.insert(3);a
		list.insert(4);
		list.display();


	
	}
}