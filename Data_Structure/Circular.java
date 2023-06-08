package Data_Structure;


public class Circular {
	Node last=null;
	
   class  Node
	{ 
		int data;
	    Node next;  
	    Node(int data)
	    { 
	    	this.data=data;
	        next=null;
	    }
	 
	}
	public void insertAtBegining(int data)
	{
		Node newnode=new Node(data);
		if(last==null)
		{	
		  newnode.next=newnode;
		   last=newnode;
 		 return;
		}

			newnode.next=last.next;
			last.next=newnode;
             return;
		
	}
	public void delete()
	{
		if(last==null)
		{
			System.out.println("Invalid Position");
			return;
		}
		if(last==last.next)
		{	last=null;
		   return;}
		
		
		
	}
	public void display()
	{ 
		Node temp=last.next;
          do
          {
	    		System.out.println(temp.data+" ");
	    		temp=temp.next;  
          }while(temp!=last.next);
	    		
	}
public static void main(String []args)
{
	Circular c=new Circular();
	c.insertAtBegining(5);
	c.insertAtBegining(4);
	c.insertAtBegining(3);
	c.insertAtBegining(2);

	c.display();

  }
}
