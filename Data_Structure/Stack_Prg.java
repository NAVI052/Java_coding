package Data_Structure;

public class Stack_Prg 
{
	 int top;
	 int capacity;
	 int[] stack;
	public Stack_Prg()
	 {
		 top=-1;
		 capacity=5;
		 stack=new int[capacity];
	 
	 }

	 public boolean isEmpty()
	 {
		 return top==-1;
	 }
	 public boolean isFull()
	 {
		 return top==capacity-1;
	 }

	 public int push(int data)
	 
	 {
		 if(isFull())
		 {
			 System.err.println("Stack is full");
			 return Integer.MAX_VALUE;
			 
		 }

		 return stack[++top]=data; 
	 }
 public int pop()
	 
	 {
		 if(isEmpty())
		 {
			 System.out.println("Stack is Empty");
			 return Integer.MIN_VALUE ;
			 
		 }
		 return stack[top--]; 
	 }
 public int peek()
     { 
	 if(top==-1)
	 {
    	 System.out.println("No peek Value");
    	 return Integer.MIN_VALUE;
    	  }     
	 return stack[top];
	      }
public void display()
    {
	for(int i=0;i<=top;i++)
	{
		System.out.println(stack[i]);
	}
	}
 
	public static void main(String[] args)
	{ 
       Stack_Prg sp=new Stack_Prg();
       sp.push(50);
       sp.push(40);
       sp.push(20);
       sp.push(30);
       sp.push(10);
	   sp.display();
	   System.out.println("After Deletion");

       sp.pop();
       sp.pop();
       sp.display();


     	}

}
