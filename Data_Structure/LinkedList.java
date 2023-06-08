package Data_Structure;

public class LinkedList
{
	Node head;
	LinkedList()
	{
		head=null;
	}
   class  Node
	{ 
		int data;
	    Node next;  
	    Node(int v)
	    { 
	    	data=v;
	        next=null;
	    }
	 
	}
	public void insertAtBegining(int v)
	{
		Node nn=new Node(v);
		if(head==null)
		   head=nn;
		else
		{

			nn.next=head;
			head=nn;

		}
	}
	public void middleInsert(int pos,int v )
	{
		if(pos==0)
		{
			insertAtBegining(v);
			return;
		}
		 Node nn=new Node(v);
		 Node temp=head;
		 for(int i=1;i<pos;i++)
		 {
			 temp=temp.next;
			 
			 if(temp==null)
			 {
				 System.out.println("Invalid position");
				 return;
			 }
			 
		 }
		 nn.next=temp.next;
		 temp.next=nn;
	}
	public void delete(int pos)
	{
		if(head==null)
		{
			System.out.println("Invalid Position");
			return;
		}
		if(pos==0)
		{
			head=head.next;
			return;
		}
		Node temp=head;
		Node prev=null;
		for(int i=1;i<=pos;i++)
		{
			prev=temp;
			temp=temp.next;
				}
		prev.next=temp.next;
		}
	public void display()
	{ 
		Node temp=head;
	    	while(temp==null)
	    	{
	    		System.out.println(temp.data+" ");
	    		temp=temp.next;
	    	}
	}
	public static void main(String [] args)
	{
		LinkedList l= new LinkedList();
		l.insertAtBegining(0);

		l.middleInsert(1,1);
		l.middleInsert(2,2);
		l.middleInsert(3,3);
		


        l.display();
	}}