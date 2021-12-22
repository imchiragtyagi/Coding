class Stack
{
  int top;
  int capacity;
  int []stack;
  int size;

  public Stack()
  {
  	top=-1;
  	capacity=10;
  	stack=new int[capacity];
  	size=0;
  }
//stack 1
  public boolean isEmpty()
  {
  	return top==-1;
  }
  //stack 2
  public boolean isFull()
  {
  	return top==capacity-1;

  }
  //stack 3
  public int  push(int val)
  {
  	if(isFull())
  	{
  		System.out.println("Stack is full");
  	}
  	size++;
    return stack[++top]=val;
  }
  //stack 4
   public int pop()
  {
  	if(isEmpty())
  	{
  		System.out.println("Stack is empty");
  	}
  	size--;
  	return stack[top--];
  	
  }
  //stack 5
  public int peek()
  {
  	return stack[top];
  }
  public void display()
  {
  	for(int i=0;i<=size;i++)
  	{
  		System.out.println(stack[i]);
  	}

  }


	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(34);
		st.push(54);
		st.push(34);
		st.push(54);
		st.pop();
		System.out.println(st.isEmpty());
		System.out.println(st.isFull());
		System.out.println(st.peek());
	    st.display();



		
	}
}