class DLL{
	private Node head;
	//private Node tail;
	private int size;

	public DLL(){
		this.size=0;
	}
	public void insertfirst(int val)
	{
		Node node =new Node(val);
		node.next=head;
		node.prev=null;
		if(head!=null){
         head.prev=node;
          }
          head=node;
          size++;
}
//if tail is not provided..
public void insertlast(int val)
{
Node node=new Node(val);
Node temp=head;

if(head==null)
{
	node.prev=null;
	head=node;
	return;
}
while(temp.next!=null)
{
	temp=temp.next;//getting the position of tail
}
node.next=null;
temp.next=node;
node.prev=temp;



}




public void display()
{
	Node node=head;
	while(node!=null)
	{
		System.out.print(node.val+"->");
		node=node.next;
	}
	System.out.println("End");
}
public Node find(int value)
{
	Node node=head;
	while(node!=null)
	{
		if(node.val==value)
		{
			return node;
		}
		node=node.next;

	}
	return null;
}
public void insert(int after,int val)
{
	Node p=find(after);

	if(p==null)
	{
		System.out.println("not exist ");
		return;
	}
	Node node=new Node(val);
	node.next=p.next;
    p.next=node;
    node.prev=p;
    if(node.next!=null){
    node.next.prev=node;
     } 

}
public void displayreverse()
{
	Node node=head;
	Node last =null;

	while(node!=null)
	{
		last=node;
		node=node.next;
	}
	while(last!=null)
	{
		System.out.print(last.val+"->");
		last=last.prev;
	}
	System.out.println("Start ");
	
}
private class Node
	{
		int val;
		Node next;
		Node prev;
		 public Node(int val){
		 	this.val=val;
		 }
		 public Node(int val,Node next,Node prev){
		 	this.val=val;
		 	this.next=next;
		 	this.prev=prev;
		 }
		}
	}
	class DoublyLinkedList
{
	public static void main(String[] args) {
		DLL list=new DLL();
		list.insertfirst(2);
		list.insertfirst(3);
		list.insertfirst(4);
		list.insertlast(17);
		list.insert(4,9);

		list.display();
		list.displayreverse();


	}
}
