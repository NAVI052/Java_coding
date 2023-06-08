package Data_Structure;

public class DoublyLinkedList  {  
  Node head=null;
  Node tail=null;
  
    class Node{  
        int data;  
        Node prev;  
        Node next;  
  
        public Node(int data)
        {  
            this.data = data; 
            prev=null;
            next=null;
        }  
    }  
    public void InsertAtBeginning(int data)
    {
    	Node newnode=new Node(data);
    	if(head==null)
    		head=tail=newnode;
    	else
    	{
    		newnode.next=head;
    		head.prev=newnode;
    		head=newnode;
    	}    	
    }
  
    public void addNode(int data)
    {  
        Node newNode = new Node(data);  
  
        if(head == null) {  
            head = tail = newNode;  
             
        }  
        else {  
            tail.next = newNode;  
            newNode.prev = tail;  
            tail = newNode;  
        }  
    }  
	public void InsertAtPosition(int pos,int data)
    {
    	Node newnode=new Node(data);
    	if(pos==0)
    	{
    		InsertAtBeginning(data);
    	    return;
    	}
    	Node temp=head;
    	for(int i=1;i<pos;i++)
    	{
    		temp=temp.next;
    		if(temp==null)
    		{System.out.println("Invalid position");
    		return;
    		}
    		
    	}
    		if(temp==tail)
    		{
    			addNode(data);
    			return;
    		}
    	
    		newnode.next=temp.next;
    		newnode.prev=temp;
    		temp.next.prev=newnode;
    		temp.next=newnode;
    		
    		return;
    	}
    
    public void deletePosition(int pos)
    {
    	if (head==null)
    	{
    		throw new IndexOutOfBoundsException("Invalid Position");
    		
    	}
    	if(pos==0)
    	{
    		head=head.next;
    		if(head==null)
    		{
    			tail=null;
    			return;
    		}
    		head.prev=null;
    		return;
    	}
    	Node temp=head;
    	Node prev=null;
    	for(int i=1;i<=pos;i++)
    	{
    		prev=temp;
    		temp=temp.next;
    		if(temp==null)
    		{
    			throw new IndexOutOfBoundsException("Invalid Position");
    			
    		}
    	}
    	if(temp==tail)
    	{
    		tail=prev;
    		tail.next=null;
    		return;
    	}
    	prev.next=temp.next;
    	temp.next.prev=prev;
    }
    public void display()
    {
    	Node temp=head;
    	while(temp!=null)
    	{
         System.out.print(temp.data+" ");
         temp=temp.next;
         }
    }
    public void displayrev()
    {
    	Node temp=tail;
    	while(temp!=null)
    	{
         System.out.print(temp.data+" ");
         temp=temp.prev;
         }
    }

       
    
    public static void main(String[] args) 
    {  
  
        DoublyLinkedList d = new DoublyLinkedList(); 
        d.InsertAtBeginning(20);
        d.InsertAtBeginning(10);
        d.addNode(30);
        d.addNode(40);
        d.addNode(50);
d.InsertAtPosition(5, 55);

        d.display();

        d.deletePosition(0);
        d.deletePosition(4);
        System.out.println("\nAfter Deletion");
        d.display();

        

        System.out.println("\nAfter Revesal");
        d.displayrev();
         }  
}  




   