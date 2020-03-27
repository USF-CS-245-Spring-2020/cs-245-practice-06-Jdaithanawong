public class LinkedList<T> implements List<T>
{
	static class Node<T>
	{
		T data;
		Node next;
		Node(T d)
		{
			next = null;
			data = d;
		}
	}
	
	public Node<T> head;
	public int size; 
	
	public LinkedList()
	{
		size = 0;
		this.head = null;
	}
	
	public  void add(T item)
	{
		if(head == null)
		{
			Node current = new Node(item);
			head = current;
			size++;
		}
		else
		{
			Node previous = head;
			for(int i = 0; i < size - 1; i++)
			{
				previous = previous.next;
			}
			Node current = new Node(item);
			previous.next = current;
			size++;
		}
	}
	
	public void add(int pos, T item)
	{
		if(pos == 0)
		{
			Node current = new Node(item);
			current.next = head;
			head = current;
			size++;
		}
		else
		{
			Node previous = head;
			for(int i = 0; i < size - 1; i++)
			{
				previous = previous.next;
			}
			Node current = new Node(item);
			current.next = previous.next;
			previous.next = current;
			size++;
		}
	}
	
	public T get(int pos)
	{
		if(pos < 0 || pos > size)
		{
			throw new ArrayIndexOutOfBoundsException("Please enter a valid position");
		}
		Node node = head; 
		for(int i = 0; i < pos; i++)
		{
			node = node.next;
		}
		return (T) node.data;
	}
	
	public T remove(int pos)
	{
		if(pos < 0 || pos > size)
		{
			throw new ArrayIndexOutOfBoundsException("Please enter a valid position");
		}
		if(pos == 0)
		{
			Node current = head;
			head = head.next;
			size--;
			return (T) current.data;
		}
		else
		{
			Node previous = head;
			for(int i = 0; i < pos - 1; i++)
			{
				previous = previous.next;
			}
			Node current = previous.next;
			previous.next = current.next;
			size--;
			return (T) current.data;
			
		}
	}
	
	public int size()
	{
		return size; 
	}
	
	
}