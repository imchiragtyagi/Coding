class LL{
	private Node head;
	private Node tail;

	private int size;

	public LL(){
		this.size=0;

	}//adding first element in start [microsoft board ]
	public void insertfirst(int value)
	{
		Node node =new Node(value);
		node.next=head;
		head=node;

		if(tail==null)
		{
			tail=head;
		}
		size+=1; 

	}
	//delete at particular index
	public void delete(int index)
	{
		if(head==null)
		{
			return ;
		}
		Node temp=head;
		if(index==0)
		{
			head=temp.next;
			return;
		}
		for(int i=1;temp!=null&&i<index;i++)
		{
			temp=temp.next;
			if(temp==null||temp.next==null)//if position is more then the number of nodes.
           {
           	return;
 
            }
            Node next=temp.next.next;
            temp.next=next;
		}
	}

//Adding element in the end i.e tail
	public void insertend(int val)
	{
		if(tail ==null)
		{
			insertfirst(val); 
			return;
		}
		Node node =new Node(val);
		tail.next=node;
		tail=node;
		size++;
	}

	public void insert(int val,int index)
	{
		if(index==0)
		{
			insertfirst(val);
			return;
		}
		if(index==size)
		{
			insertend(val);
			return;
		}
		Node temp= head;//because index is zero
		for (int i=1;i<index ;i++ ) {
			temp=temp.next;
			
		}
		Node node=new Node(val,temp.next);
		temp.next=node;
		size++;
}



	//concept of temp here
	public void display(){
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.value + "->");
			temp=temp.next;
		}
		System.out.println("End");

	}
 

	private class Node{
		private int value;//data in node 
		private Node next;//pointing to the next node

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
}
class LinkedList
{
	public static void main(String[] args) {
		LL list=new LL();
		list.insertfirst(2);
		list.insertfirst(3);
		list.insertfirst(4);
		list.insertend(17);
		list.insert(100,3);
		list.delete(2);

		list.display();

	}
}