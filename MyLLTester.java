public class MyLLTester
{
  public static void main(String [] args)
  {
    MyLinkedList liam = new MyLinkedList();
    System.out.println(liam.isEmpty());
    System.out.println(liam.size());
    //System.out.println(liam.toString());
    liam.add(new ListNode("leo", null));
    liam.addFirst(new ListNode("kat", null));
    liam.addLast(new ListNode("jas", null));
    liam.add(new ListNode("med", null));
    liam.add(new ListNode("nik", null));
    liam.add(new ListNode("nic", null));
    System.out.println(liam.isEmpty());
    System.out.println(liam.size());
    System.out.println(liam.toString());
    System.out.println(liam.get(0));
    System.out.println(liam.set(1, "eee"));
    System.out.println(liam.get(1));
    System.out.println(liam.remove(1));

  } // end main
  
} // end class
