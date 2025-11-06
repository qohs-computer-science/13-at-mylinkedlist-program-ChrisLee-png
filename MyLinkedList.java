/*
*MyLinkedList.java
*Data structure with properties similar to the Java LinkedList, but is a singly-linkedlist.
*/


public class MyLinkedList
{
    private ListNode head;
    private int size;
    public MyLinkedList()
	{
		head = null; 
		size = 0;
	}// end Constructor
    public int size()
    {
    return size;
    }//end size method
    public boolean isEmpty()
    {
    return (size==0);
    }//end isEmpty method
    public String toString()
    {
        String r = "Empty list";
        if(!isEmpty())
        {
            r="";
            int index=0; 
            ListNode temp = head;
            while(temp!=null)
            {
                r+= (index + ": " + (temp.getValue())+"\n");
	            temp = temp.getNext();
	            index++;
            }
        }
    return r;
    }//end toString method
    public boolean add(Object newItem){
        ListNode temp = head;
        if(!isEmpty()){
            while(temp.getNext()!=null)
            {
                temp=temp.getNext();
            }
            temp.setNext(new ListNode(newItem, null));
        }
        else
        {
            head = new ListNode(newItem, null);
        }
        size+=1;
        return true;
    }//end add method
    public boolean addFirst(Object newItem){
        if(!isEmpty()){
            ListNode e = new ListNode(newItem, null);
            e.setNext(head);
            head = e;
        }
        else
        {
            head = new ListNode(newItem, null);
        }
        size+=1;
        return true;
    }//end addFirst method
    public boolean addLast(Object newItem)
    {
        return add(newItem);
        
    }//end addLast method
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
        size+=1;
        return temp.getValue();

    }//end get method
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
        return r;

    }//end set method
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
        temp = temp.getNext();
        r.setNext(temp.getNext());
        temp.setNext(null);
        size--;
        return temp.getValue();
    }//end removeLast method
    public Object removeFirst()
    {
        ListNode temp = head;
        temp.setNext(null);
        head = head.getNext();
        size--;
        return temp.getValue();
    }//end removeLast method
    public Object removeLast()
    {
        ListNode temp = head;
        while(temp.getNext().getNext()!=null)
            {
                temp=temp.getNext();
            }
        ListNode enz = temp;
        temp.setNext(null);
        size--;
        return enz.getValue();
    }//end removeLast method
}//end class
