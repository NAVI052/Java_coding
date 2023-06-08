package Data_Structure;


public class CircularLinkedList
{
public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data; 
            next=null;
        }  
    }  
  
    Node head = null;  
    Node tail = null; 
    public void headIsNull(int data)
    {  	  Node newNode = new Node(data);  

              head = newNode;  
              tail = newNode;  
              newNode.next = head;  
              return;
          
    }
    public void insertAtBeginning(int data) {
    	  Node newNode = new Node(data);
    	  if (head == null) {
    	    headIsNull(data);
    	    return;
    	  }
    	  Node temp = head;
    	    newNode.next = temp;
    	    head = newNode;
    	  tail.next = head;
    	 return;
    	}

    public void addNode(int data)
    {  
  	  Node newNode = new Node(data);  
          if(head==null)
          {
          headIsNull(data);
          return;
          }
          
            tail.next = newNode;  
            tail = newNode;  
           tail.next = head;  
           return;
        }  
      
    public void insertAtIndex(int pos, int data) {
    	Node newnode=new Node(data);
    	if(pos==0)
    	{
    		insertAtBeginning(data);
    	    return;
    	}
    	  Node temp= head;
    	  if (temp == null )
    	  {
    	    System.out.println("Invalid position");
    	  return;
    	  }
    	  
    	    for (int i = 1; i < pos; i++) {
    	      temp = temp.next;
    	      if(temp==null)
    	      {System.out.println("Invalid position");
    	      return;
    	      }
    	    }
    	    newnode.next = temp.next;
    	    temp.next = newnode;
    	    tail.next=head;
    	  // System.out.println(head.data+"huhhh");
    	    return;
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
			tail.next=head;
			return;
		}
		Node temp=head;
		Node prev=tail;
		for(int i=1;i<=pos;i++)
		{
			prev=temp;
			temp=temp.next;
				}
		if(temp==tail)
		{
			tail=prev;
			tail.next=head;
			return;
		}
		prev.next=temp.next;
		}
    
  
    public void display() {  
        Node temp= head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;
        }  
      do  {        System.out.print(" "+ temp.data);  
                  temp=temp.next;
            System.out.println();  
        } while(temp != head);

        }  
  
    public static void main(String[] args)
    {  
        CircularLinkedList cl = new CircularLinkedList();  
        cl.insertAtBeginning(4);
        cl.insertAtBeginning(5);
        cl.addNode(3);  
        cl.addNode(2);  
        cl.addNode(1);
       // cl.insertAtIndex(4,555);
        cl.delete(0);
        //cl.delete(1);

        
        


        cl.display();  
    }  
}  