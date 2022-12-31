package datastructure;

import java.util.NoSuchElementException;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		class arrayQueue
		{
			protected int Queue[] ;
			protected int front, rear, size, len;


			public arrayQueue(int n)
			{
				size = n;
				len = 0;
				Queue = new int[size];
				front = -1;
				rear = -1;
			}
			public boolean isEmpty()
			{
				return front == -1;
			}
			public boolean isFull()
			{
				return front==0 && rear == size -1 ;
			}
			public int getSize()
			{
				return len ;
			}
			public int peek()
			{
				final String O = "Underflow Exception";
				final String s1 = "Underflow Exception";
				if (isEmpty())

					return Queue[front];
				return 0;
			}
			public void insert(int i)
			{
				if (rear == -1)
				{
					front = 0;
					rear = 0;
					Queue[rear] = i;
				}
				else if (rear + 1 >= size)
					throw new IndexOutOfBoundsException("Overflow Exception");
				else if ( rear + 1 < size)
					Queue[++rear] = i;
				len++ ;
			}

			public int remove()
			{
				final String s = "Underflow Exception";
				final String s1 = "Underflow Exception";
				final String s2 = "Underflow Exception";
				if (isEmpty())
					throw new NoSuchElementException("Underflow Exception");

				else
				{
					len-- ;
					int ele = Queue[front];
					if ( front == rear)
					{
						front = -1;
						rear = -1;
					}
					else
						front++;
					return ele;
				}
			}

			public void display()
			{
				System.out.print("\nQueue = ");
				if (len == 0)
				{
					System.out.print("Empty\n");
					return ;
				}
				for (int i = front; i <= rear; i++)
					System.out.print(Queue[i]+" ");
				System.out.println();
			}
		}

	}

}