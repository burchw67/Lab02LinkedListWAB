public class LinkedList<T>
{
	// Head pointer
	protected Node<T> head;
	public int size;
	
	public LinkedList()
	{
		head = null;
		size = 0;
	}
	
	public void insertAtHead(T val)
	{
		Node<T> nPtr = new Node<T>(val, null);
		if(head == null)
		{
			head = nPtr;
		}
		else
		{
			nPtr.next = head;
			head = nPtr;
		}
		size++;
	}
	
	public void insertAtTail(T val)
	{
		Node<T> nPtr = new Node<T>(val, null);
		Node<T> ptr = head;
		if(head == null)
		{
			head = nPtr;
			size++;
			return;
		}
		
		while(ptr.next != null)
		{
			ptr = ptr.next;
		}
		
		ptr.next = nPtr; 
		size++;
	}
	
	public boolean deleteAtHead()
	{
		if(head != null)
		{
			head = head.next;
			size--;
			return true;
		}
		return false;
	}
	
	public boolean deleteAtTail()
	{
		if(size == 0)
			return false;
		if(size == 1)
		{
			deleteAtHead();
			return true;
		}
		Node<T> tmp = head;
		while(tmp.next != null)
		{
			if(tmp.next.next == null)
			{
				tmp.next = null;
				size--;
				return true;
			}
			tmp = tmp.next;
				
		}
		return false; // should never get here
		
	} // end of deleteTail

    public boolean insertAtPos(T val, int pos)
    {
        Node<T> nPtr = new Node<T>(val, null);
        Node<T> ptr = head;
        int posCount = 0;

        if(size == 0 || pos == 0)
        {
            insertAtHead(val);
            return true;
        }
        else
        {
            while(ptr.next != null)
            {
                if(posCount == pos - 1)
                {
                    nPtr.next = ptr.next;
                    ptr.next = nPtr;
                    size++;
                    return true;
                }
                else
                {
                    ptr = ptr.next;
                    posCount++;
                }
            }
        }
        return false;
    }
	
	public boolean deleteAtPos(int pos)
	{
        if(size == 0)
        {
            return false;
        }
		else if(pos == 0)
        {
            deleteAtHead();
            return true;
        }
        else if (pos == size - 1)
        {
            deleteAtTail();
            return true;
        }
        else
        {
            Node<T> tmp = head;

            if(tmp.next.next == null)
            {
                deleteAtTail();
                return true;
            }
            else
            {
                for(int i = 0; i <= pos; i++)
                {
                    if(i == pos-1)
                    {
                        tmp.next = tmp.next.next;
                        size--;
                        return true;
                    }
                    else
                    {
                        tmp = tmp.next;
                    }
                }
            }
        }
        return false;
	}

    public T examineElementAtPos(int pos)
    {
        if(head == null)
        {
            System.out.println("The list is empty!\n");
        }
        else
        {
            Node<T> ptr = head;
            for(int i = 0; i <= pos; i++)
            {
                if(i == pos)
                {
                    return ptr.data;
                }
                else
                {
                    ptr = ptr.next;
                }
            }
        }
        return null;
    }

    public int getSize()
    {
        return size;
    }

    public boolean isEmpty()
    {
        if(size == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
	
	public void PrintList()
	{
		System.out.println("Singly Linked lIst = ");
		System.out.println("Size = " + size);
		if(size == 0)
		{
			System.out.println("Empty");
			return;
		}
		
		if(head.next == null)
		{
			System.out.println(head.data);
			return;
		}
		
		Node<T> ptr = head;
		while(ptr != null)
		{
            if(ptr.next != null)
            {
                System.out.print(ptr.data + " -> ");
                ptr = ptr.next;
            }
            else
            {
                System.out.print(ptr.data + "\n");
                ptr = ptr.next;
            }
		} 
	} // end of PrintList

	public void getHead()
	{
		if(head == null)
		{
			System.out.println("The list is empty!\n");
		}
		else
		{
			System.out.println("The character at the head of the list is: " + head.data);
		}
	}

	public void getTail()
	{
		if(head == null)
		{
			System.out.println("The list is empty!\n");
		}
		else
		{
			Node<T> ptr = head;
			while(ptr.next != null)
			{
				ptr = ptr.next;
			}

			System.out.println("The character at the tail of the list is: " + ptr.data);
		}
	}

	public void clearList()
	{
        Node<T> ptr = head;
        while (ptr != null) {
            Node<T> temp = ptr;
            ptr = ptr.next;
            temp.next = null;
        }
        head = null;
        size = 0;
	}
} // end of class