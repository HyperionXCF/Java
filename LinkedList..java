import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Iterator; // // required for using iterators on data structures.

class Main{
    public static void main(String[] args){
        // // LINKEDLISTs 
        // // linkedlist is a chain of nodes which has a data part and address to the next and previous (for doubly linkedlist) node.
        // // elements are linked using pointers.
        
        // // advantages of linkedlist 
        
        // // 1. dyanmics structure, can allocate memory as per need
        // // 2. insertion and deletion is easier 
        // // 3. no or low memory waste
        
        // // disadvantages 
        
        // // 1. needs lot of memory to store addresses of next previous nodes.
        // // 2. no random access to element 
        // // 3. accessing searching element is more time consuming.
        
        // // uses
        
        // // 1. implements stacks and queue
        // // 2. GPS navigation
        // // 3. music playlist
        
         LinkedList<String> ll = new LinkedList<>();
         
         // // by default linkedList are implemented as doubly linkedlist DS 
         // // linkedlist class stores the location of first and last nodes.
         // // inner class Node inside the linkedlist 
         // // each node knows the memory address of previous node and next node
         
         // // linkedlist implements deque interface 
         // // 12 methods with deque.
         // // we can also treat our linkedlist as a stack or queue
         
         // // linkedList as a stack ---> stack is last in first out.
         
         // // push() method 
         ll.push("A");
         ll.push("B");
         ll.push("C");
         ll.push("D");
         ll.push("F");
         
         System.out.println(ll);
         
         // // pop() method 
         System.out.println(ll.pop());
         System.out.println(ll.pop());
         
         // // linkedlist as queue
         
         // // offer() method 
         
         ll.offer("A");
         ll.offer("B");
         ll.offer("C");
         ll.offer("D");
         ll.offer("F");
         
         System.out.println(ll);
         
         // // poll() method
         System.out.println(ll.poll());
         
         
        // // inserting in a linked list 
        // // add(idx, element);
        // // remove(element);
        
        ll.add(4,"E");
        ll.remove("E");
        
         System.out.println(ll);
         
         // // there's no random access to linkedlist
         
         // // indexOf(element) method to search for an element in the linkedlist.
         // // if element present = index 
         // // otherwise -1
         
         System.out.println(ll.indexOf("E"));
         
         // // methods related to linkedlist
         
         // // peeking first or last node element
         
         System.out.println(ll.peekFirst());
         System.out.println(ll.peekLast());
         
         // // adding new nodes at head or tails (front or back)
         // // addFirst(element);
         // // addLast(element); 
         // // addFisrt or addLast method returns void btw so it cant be printed.
         
         ll.addLast("Z");
         ll.addFirst("Q");
         System.out.println(ll);
         
         // // iterating over the linkedlist using foreach loop
         
         for(String element : ll){
             System.out.println(element);
         }
         
         // // using java lambda expression 
         
         System.out.println("USING LAMBDA EXPRESSIONS");
         ll.forEach(element -> System.out.println(element));
         
        // // using iterator import java.util.Iterator;
        // // hasNext returns true if theres an element left, otherwise false.
        
        Iterator<String> i = ll.iterator();
        while(i.hasNext()){
            String element = i.next();
            System.out.println(element);
        }
        
    }
}
