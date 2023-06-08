package Data_Structure;

public class Queue_Prg {
           int front, rear, capacity, queue[];

		public Queue_Prg()
		{
			front = 0;
			rear = 0;
			capacity = 5;
			queue = new int[capacity];
		}
		public void Enqueue(int data)
		{
			if (capacity == rear) 
		{
				System.out.println("\nQueue is full\n");
				return;
			}
		

				queue[rear] = data;
				rear++;
			
			return;
		}

		public int Dequeue()
		{ 
		if (front == rear) 
		{
				System.out.println("\nQueue is empty\n");
				return Integer.MIN_VALUE;
			}
			else
			{			int c=queue[front];
 
				for (int i = 0; i < rear-1 ; i++)
				{
					queue[i] = queue[i + 1];
					
				}			
				
				rear--;
				return   c;

			}
		}

		
		public void Display()
		{
			int i;
			if (front == rear)
			{
				System.out.printf("\nQueue is Empty\n");
				return;
			}
			else
			{
			for (i = front; i < rear; i++)
			{
				System.out.print(" "+ queue[i]);
			}}
			return;
		}

	      public void Front()
		{
			if (front == rear) 
			{
				System.out.println("\nQueue is Empty\n");
				return;
			}
			System.out.println("\nFirst element"+queue[front]);
			return;
		}
	


		public static void main(String[] args)
		{
			Queue_Prg qp = new Queue_Prg();


			qp.Enqueue(20);
			qp.Enqueue(30);
			qp.Enqueue(550);
			qp.Enqueue(50);
			qp.Enqueue(90);
			//qp.Enqueue(25);


			qp.Display();

				System.out.println(	"\nAfter Dequeued ");




		//	qp.Display();
		


		//	qp.Front();
		}
	}


