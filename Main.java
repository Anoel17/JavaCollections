import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
import java.util.Iterator;
import java.util.Enumeration;

/*
What are the features of the respective collections
A program on each of the implementation classes performing the CRUD operations.
Room 1: List- ArrayList, LinkedList, Vector
 */

/**
 *
 * @author $Austin Noel
 */
public class Main {

    public static void myLinkedList() {
        // Linked List does not allow random access of its data,
        // But it is more efficient than ArrayList if random access isn't needed.
        // To access its data, you can use iteration.
        List exampleLink = new LinkedList();
        exampleLink.add("Cat");
        exampleLink.add("Dog");
        exampleLink.add("Turtle");
        exampleLink.add("Fish");
        
        //This call to random access, however, does work. But not how you might expect.
        //You aren't actually "randomly accessing" this point in data at all. 
        //Instead, it iterates through the linked list until it reaches the requested element.
        System.out.println("The 4th element in the Linked List is: "+exampleLink.get(3)); 
        System.out.println();
        
        //To get the information one by one, similar to iterating over an array with a for-loop,
        // You use an iterator!
        Iterator linkIterator = exampleLink.iterator();
        while (linkIterator.hasNext()) {
            System.out.println(linkIterator.next() + " ");
        }
        System.out.println();
    }
    
    
    public static void myArrayList() {
        // ArrayLists allow for random access to their contents, similar to an array. 
        // However, they are less efficient than a Linked List for if you don't need random access.
        List exampleArrayList = new ArrayList();
        exampleArrayList.add("Banana");
        exampleArrayList.add("Apple");
        exampleArrayList.add("Orange");
        exampleArrayList.add("Coconut");
        
        //The below code allows for a direct random access call.
        // This is inherently faster than get() for Linked Lists since it doesn't have to iterate.
        System.out.println("The last element in the ArrayList is: "+exampleArrayList.get(3));
        System.out.println();
        // We can still use the iterator to move through the ArrayList as well, making it a versatile tool.
        Iterator arrayListIterator = exampleArrayList.iterator();
        while (arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }
        System.out.println();
    }
    
    public static void myVector() {
        //vectors are a somewhat deprecated part of the List family.
        //They can be moved through using enumeration rather than iteration.
        //Unlike the other Lists, these do not have a hardly-defined size.
        //As such, they don't need to reestablish themselves for each added item.
        //This makes them great for instances where the amount of items being added could vary into a massive count.
        Vector exampleVector = new Vector();
        exampleVector.add("Dave");
        exampleVector.add("John");
        exampleVector.add("Tony");
        exampleVector.add("Jamal");
        
        //Random access in a Vector is allowed, similar to an ArrayList
        System.out.println("The last element in the Vector is: "+exampleVector.get(3));
        System.out.println();
        // Vectors can be moved through using enumeration rather than iteration. 
        // Enumeration, unlike iteration, is effectively read-only. It can't alter what it's reading through.
        // This is because it is not a global pointer like a linked list iterator. It is user-defined data.
        // As such, you can't make iterative changes along an entire vector the same way you can with an iterator.
        Enumeration vectorEnum = exampleVector.elements();
        //You can't establish an enumerator like this if you define a vector as type List, since the List interface does not have an elements() method.
        
        while (vectorEnum.hasMoreElements()) {
            System.out.println(vectorEnum.nextElement());
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        myLinkedList();
        myArrayList();
        myVector(); 
    }
}
