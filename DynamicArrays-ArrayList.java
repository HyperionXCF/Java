import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        // // DYNAMIC ARRAYS aka ArrayList
        // // resizable array 
        // // basically C++ vectors 
        
        
        // static array String[] str = new String[capacity];
        // // fixed size 
        // // has indexes O(1) access
        // // searching O(N) if N elements 
        // // insertion / deletion is O(N)
        
        // // dynamic arraylist 
        // // capacity - max number of elements that can be stored without needing to increase the size.
        // // size - no of elements currently stored in the arrayList.
        // // if no of element > size
        // // when we try to add an element and the size exceeds capacity, java creates a new array of capacity =  currentsize*1.5 and copies all the elements to newer array.
        
        
        // // advantages 
        // // 1. random access to element
        // // good locality of reference and data cache utilisation 
        // // easy to insert or delete the end
        
        // // wastes more memory space than a linkedlist 
        // // shifting of element is time taking during insertion and deletion.
        // // expanding and shrinking is time consuming because we need to copy the existing elements in newer list.
        
        // // instantiating an arraylist 
        // ArrayList <String> al = new ArrayList<>();
        
        // // creating an arraylist from scratch.
        // // arraylist is resizeable implementation of array 
        
        DynamicArray dn = new DynamicArray();
        System.out.println(dn.capacity); // // default capacity equals to 10 
        
        // // custom capacity
        DynamicArray dnn = new DynamicArray(20);
        System.out.println(dnn.capacity);
        

        dn.add("1");
        dn.add("2");
        dn.add("3");
        
        System.out.println(dn);
        System.out.println(dn.size);
        System.out.println(dn.capacity);
        System.out.println(dn.isEmpty());
        
        
    }
}

class DynamicArray{
    int size;
    int capacity = 10; // // intital default
    // // creating an static array to keep objects / items
    Object[] array;
    
    // // constructor with default capacity
    public DynamicArray(){
        this.array = new Object[capacity];
    }
    // // constructor with custom capacity
    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    
    // // method to add elements 
    
    public void add(Object data){
        if(size >= capacity){
            grow(); // // to expand the size of array
        }
        
        array[size] = data;
        size++;
    }
    // // method to insert at specific index 
    public void insert(int index,Object data){
        // // if the size is >= capacity we need to grow the array.
        if(size >= capacity){
            grow();
        }
        // // we will shift the elements to the right to 
    }
    // // method to delete elements
    public void delete(Object data){
        
    }
    
    // // searching and returning index or -1 if not found
    public int search(Object data){
        return -1;
    }
    
    private void grow(){
        
    }
    
    private void shrink(){
        
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public String toString(){
        String string = "";
        
        // // iterating and adding element to the empty string 
        
        for(int i=0;i<size;i++){
            string += array[i] + ", ";
        }
        
        // // string.length() - 2 to remove last space and comma 
        string = "[" + string.substring(0,string.length()-2) + "]";
        
        if(string!=""){
            return string;
        }else{
            string = "[]";
        }
        
        return string;
    }
}
