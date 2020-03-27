import java.util.Arrays;

public class ArrayList<T> implements List<T>{

	protected int size;
	private T[] List;
	
	public ArrayList()
    {
        List = (T[]) new Object[10];
        size = 0;
    }
	public void add(T item)
	{
		if(size == List.length)
		{
			doubleSize();
		}
		List[size++] = item;
	}
	public void add(int pos, T item)
	{
		if(pos < 0 || pos > size)
		{
			throw new ArrayIndexOutOfBoundsException("Please enter a valid position");
		}
		if(size == List.length)
		{
			doubleSize();
		}
		List[size++] = item;
				
	}
	public T get(int pos)
	{
		if(pos < 0 || pos > size)
		{
			throw new ArrayIndexOutOfBoundsException("Please enter a valid position");
		}
		return List[pos];
	}
	public T remove(int pos)
	{
		if(pos < 0 || pos > size)
		{
			throw new ArrayIndexOutOfBoundsException("Please enter a valid position");
		}
		T temp = List[pos];
		size--;
		for(int i = pos; i < List.length - 1; i++)
		{
			List[i] = List[i+1];
		}
		return temp;
	}
	public int size()
	{
		return size;
	}
	public void doubleSize()
	{
		List = Arrays.copyOfRange(List, 0, List.length * 2);
	}
}
