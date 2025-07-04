import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        // // PRIORITY QUEUES 
        
        // // priority queues is also a FIFO data structure that serves elements with the highest priorities first before elements with lower priority.
        
        // // has same methods offer() to add
        // // poll() to remove 
        
        // // elements are sorted in a particular order, numeric datatype in ascending, and String datatype in alphabetic / lexicographical order.
        // // queues are interfaces cant be implemented directly.
        // // so we use a class which utilizes the queue interface.
        // // here we will use priorityqueue 
        
        // // normal queue
        Queue<Double> queue = new LinkedList<>();
        
        queue.offer(3.0);
        queue.offer(3.2);
        queue.offer(2.0);
        queue.offer(4.0);
        queue.offer(1.5);
        
        // // iterate poll and display the content
        
        while(queue.isEmpty() != true){
            System.out.println(queue.poll());
        }
        
        // // priority queue 
        Queue<Double> pq = new PriorityQueue<>();
        
        // //offering elements to  pq.offer(3.0);
        pq.offer(3.2);
        pq.offer(2.0);
        pq.offer(4.0);
        pq.offer(1.5);
        
        // // iterating over the queue
        // // while the queue is not empty iterate over it, poll the element and display it 
        while(pq.isEmpty() != true){
            System.out.println(pq.poll());
        }
        
        // // in priority queue the elments will already be arranged in an order. by default ascending
        
        // // what if we want reverse / descending order ? 
        
        // // pass a comparator in the constructor of the priority queue
        
        Queue<Double> pqq = new PriorityQueue<>(Collections.reverseOrder());
        
        pqq.offer(3.0);
        pqq.offer(3.2);
        pqq.offer(2.0);
        pqq.offer(4.0);
        pqq.offer(1.5);
        
        // // iterating over the queue with descending order 
        // // prints in descending order 
        
        while(pqq.isEmpty()!= true){
            System.out.println(pqq.poll());
        }
        
        // // string priority queue
        
        Queue <String> pqqq = new PriorityQueue<>();
        
        pqqq.offer("A");
        pqqq.offer("D");
        pqqq.offer("Z");
        pqqq.offer("C");
        pqqq.offer("E");
        
        // // iterating over the queue
        
        while(pqqq.isEmpty()!= true){
            System.out.println(pqqq.poll());
        }
        
        // // prints in alphabetical order.
        
        // // again pass Collections.reverseOrder() comparator inside the constructor for reverse order.
    }
}
