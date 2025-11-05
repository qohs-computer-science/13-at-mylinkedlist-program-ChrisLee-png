public class MyLinkedList
{
    private ListNode head;
    private int size;
    public MyLinkedList()
	{
		head = null; 
		size = 0;
	} // end Constructor
    public int size()
    {
    return size;
    }
    public boolean isEmpty()
    {
    return (size==0);
    }
    public String toString()
    {
    int index=0; 
    ListNode temp = head;
    String r = "";
    while(temp!=null){
        r+= (index + " " + (temp.getValue())+"\n");
	    temp = temp.getNext();
	    index++;
    }
    return r;
    }
    public boolean add(Object newItem){
        ListNode temp = head;
        if(!isEmpty()){
            while(temp.getNext()!=null)
            {
                temp=temp.getNext();
            }
            temp.setNext((ListNode)newItem);
        }
        else
        {
            head = (ListNode)newItem;
        }
        size+=1;
        return true;
    }
    public boolean addFirst(Object newItem){
        if(!isEmpty()){
            ((ListNode)newItem).setNext(head);
            head = (ListNode)newItem;
        }
        else
        {
            head = ((ListNode)newItem);
        }
        size+=1;
        return true;
    }
    public boolean addLast(Object newItem)
    {
        return add(newItem);
        
    }
    public Object get(int i)
    {
        int e=0; 
        ListNode temp = head;
        if(i<0 || i>=size())
	        throw new IndexOutOfBoundsException();
        else
        {
            while(e<i)
            {
                temp=temp.getNext();
                e++;
            }
        }
        return "Value at index " + e + ": " + temp.getValue();

    }
    public Object set(int i, Object newValue)
    {
        int e=0; 
        ListNode temp = head;
        if(i<0 || i>=size())
	        throw new IndexOutOfBoundsException();
        else
        {
            while(e<i)
            {
                temp=temp.getNext();
                e++;
            }
        }
        Object r = temp.getValue();
        temp.setValue(newValue);
        return "Done, old value at " + e+ ": "+r;

    }
    public Object remove(int i)
    {
        int e=0; 
        ListNode temp = head;
        if(i<0 || i>=size())
	        throw new IndexOutOfBoundsException();
        else
        {
            while(e<i-1)
            {
                temp=temp.getNext();
                e++;
            }
        }
        ListNode r = temp;
        temp.setValue(temp.getNext());
        r.setNext(temp.getNext());
        temp.setNext(null);
        return temp.getValue();
    }

}
