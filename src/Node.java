public class Node<T>
{
	public T data;
	// protected: methods can be used by inherited classes
	protected Node<T> next;
	
	public Node()
	{
		data = null;
		next = null;
	}
	
	public Node(T data, Node<T> next)
	{
		this.data = data;
		this.next = next; 
	}
	
	public Node(T data)
	{
		this.data = data;
	}
	
	@Override
	public String toString()
	{
		return "Data = " + String.valueOf(data); 
	}
	
}
