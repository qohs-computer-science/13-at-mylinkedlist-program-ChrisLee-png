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
    System.out.println("List is empty: " + liam.isEmpty());
    System.out.println("size is: " + liam.size());
    System.out.println("List contains:\n" +liam.toString());

    dyl.addFirst("man");
    mat.addLast("eve");
    liam.add("leo");
    
    liam.addFirst("kat");
    liam.addLast("jas");
    liam.add("med");
    liam.add("nik");
    liam.add("nic");

    System.out.println("List is empty: " + liam.isEmpty());
    System.out.println("size is: " + liam.size());
    
    //System.out.println("List contains:\n" + dyl.toString());
    System.out.println("List contains:\n" + liam.toString());

    System.out.println("value at first: "+liam.get(0));
    System.out.println("value at 1: "+liam.get(1));
    System.out.println("value at last: " +liam.get(liam.size()-1));

    System.out.println("\nvalue set, old value at first: "+liam.set(0, "e"));
    System.out.println("value set, old value at 1: "+liam.set(1, "ee"));
    System.out.println("value set, old value at last: "+liam.set(liam.size()-1, "eee"));

    System.out.println("\nsize is: " + liam.size());
    System.out.println("List contains:\n" +liam.toString());

    System.out.println("value removed, old value at first: "+liam.removeFirst());
    System.out.println("value removed, old value at 1: "+liam.remove(1));
    System.out.println("value removed, old value at last: "+liam.removeLast());

    System.out.println("\nList is empty: " + liam.isEmpty());
    System.out.println("size is: " + liam.size());
    System.out.println("List contains:\n" +liam.toString());

    System.out.println("value at first: "+liam.get(0));
    System.out.println("value at 1: "+liam.get(1));
    System.out.println("value at last: " +liam.get(liam.size()-1));
    
    System.out.println("\nvalue set, old value at first: "+liam.set(0, "e"));
    System.out.println("value set, old value at 1: "+liam.set(1, "ee"));
    System.out.println("value set, old value at last: "+liam.set(liam.size()-1, "eee"));

    System.out.println("\nsize is: " + liam.size());
    System.out.println("List contains:\n" +liam.toString());

  } // end main
  
} // end class
