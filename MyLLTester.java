/*
*MyLLTester.java
*Tests the MyLinkedList class methods and constructor.
*/

public class MyLLTester
{
  public static void main(String [] args)
  {
    MyLinkedList liam = new MyLinkedList();
    MyLinkedList dyl = new MyLinkedList();
    MyLinkedList mat = new MyLinkedList();
    System.out.println(liam.isEmpty());
    System.out.println("size is: " + liam.size());
    System.out.println(liam.toString());

    liam.add("leo");
    dyl.addFirst("man");
    mat.addLast("eve");
    
    liam.add("med");
    liam.addFirst("kat");
    liam.addLast("jas");
    liam.add("nik");
    liam.add("nic");

    System.out.println(liam.isEmpty());
    System.out.println("size is: " + liam.size());
    System.out.println("List contains" + liam.toString());
    System.out.println("List contains" + dyl.toString());
    System.out.println("value at 0: "+liam.get(0));
    System.out.println("old value at 1: "+liam.set(1, "eee"));
    System.out.println("value at 1: "+liam.get(1));
    System.out.println("value removed at 1: "+liam.remove(1));
    System.out.println("value at 1: "+liam.get(1));

  } // end main
  
} // end class
