public class NodeInt
{
	private int data;
	private NodeInt next;
	
	public NodeInt() 
	{
		data = 0;
		next = null;
	}
	
	public NodeInt(int data, NodeInt next)
	{
		this.data = data;
		this.next = next;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public NodeInt getNext() {
		return next;
	}
	public void setNext(NodeInt next) {
		this.next = next;
	}
	
}
