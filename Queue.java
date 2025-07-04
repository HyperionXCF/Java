import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

class Main{
    public static void main(String[] args){
        // // queue is a fifo data structure, 
        // // first element to comein will be first element to go out. 
        // //
        
        // // Queue<String> queue = new Queue<>(); queue is actually an interface, therefore we can't instantiate queue, but we can implement queue using other class
        // // there are 2 classes in collections which will help us to implement queues, linkedlist and priorityqueue
        // // here we use linkedlist
        
        Queue<String> queue = new LinkedList<String>();
        
        // // add - enqueue or offer()
        // // remove - dequeue or poll() removes head of current queue
        // // peek() - not remove head but examine / return the head.
        
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Sigma");
        queue.offer("Bro");
        queue.offer("Aura Man");
        queue.offer("Steve");
        queue.offer("Harold");
        
        System.out.println(queue);
        
        // // using peek method to check which object is currently at the head of the queue
        
        System.out.println(queue.peek());
        
        // // removing elements from the queue
        queue.poll(); // // poll will not throw exception when there's not element left in the queue. 
        queue.peek(); // // will also not throw an exception when there's no element in the queue.
        
        // // queue class extends collections class
        // // that means we get to use many methods from collection with queues.
        
        // // checking if a queue is empty - return true if empty or false
        
        System.out.println(queue.isEmpty());
        
        // // getting the size of the queue - no of objects/elements inside the queue 
        
        System.out.println(queue.size());
        
        // // contains(element) method to check if the element is present inside the queue. returns true if found otherwise false
        
        // // this method does not give the index at which the element is currently present though
        System.out.println(queue.contains("Karen"));
        System.out.println(queue.contains("Steve"));
        
        // // queue doesn't have any method to return the index of element
        
        // // use of queue
        
        // // 1. keyboard buffer letters typed should appear on the screen in the sequence they are typed. queue is used
        // // 2. printer queue to print in sequence.
        // // 3. used in linkedlist, priorityqueue and BFS 
        // // breadth first search algorithm.
    }
}
