class CLL{
	private Node head;
	private Node tail;

    public CLL(){
		this.head=null;
		this.tail=null;
	}

	public  void insert(int val){
		Node node=new Node(val);
		if(head==null){
		head=node;
		tail=node;
	}
	tail.next=node;
	node.next=head;
	tail=node;
}
public void display()
{
	Node node=head;
	if(head!=null)
	{
		do{
			System.out.print(node.val+"->");
			node=node.next;
		}while(node!=head);
	}
}

private class Node{
		int val;
		Node next;

		public Node(int val)
		 {
		 	this.val=val;

		 }
		}
 }
 class CyclicLinkedList
{
	public static void main(String[] args) {
		CLL list=new CLL();
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(17);
		list.insert(4);

		list.display();
		//list.displayreverse();


	}
}
