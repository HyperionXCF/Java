import java.util.Stack;

class Main{
    public static void main(String[] args){
        System.out.println("Data Structure & Algorithms");
        
        // // what is a data structure 
        // // a named location that can be used to store and organise data 
        // // array - collection of elements of same datatypes stored at contigous memory locations.
        
        // // algorithm - a collection of steps to solve a problem.
        // // we apply algorithm on data, for simplicity, data should be organized 
        // // and that's what we do using data structures.
        
        // // Implementing DSA => writing time and memory efficient code. 
        
        // // STACK  DATASTRUCTURE
        
        // // LIFO DS - last in first out.
        // // stores objects in a vertical tower
        
        // // import stack from java utils
        // // declare and instantiate a stack 
        
        Stack<String> stack = new Stack<>();
        
        
        // // pushing some elements into the stack 
        stack.push("minecraft");
        stack.push("RDR2");
        stack.push("God of War Ragnarok");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");
        
        // // checking if a stack is empty 
        System.out.println(stack.empty());
        
        // // printing whole stack 
        System.out.println(stack);
        // // [minecraft, RDR2, God of War Ragnarok, DOOM, Borderlands, FFVII]
        
        // // popping topmost item ---> popping also returns the popped object.
        // // therefore we can print them or assign them to a variable 
        stack.pop(); // removes FFVII
        stack.pop(); // removes Borderlands
        stack.pop(); // removes DOOM
        System.out.println(stack.pop()); // returns and prints God of War Ragnarok 
        System.out.println(stack);
        
        // // if you try to pop an element from empty stack you get java.util.EmptyStackException error 
        
        // // searching for an element in the stack using search(element) method 
        // // search method will return the position of 
        System.out.println(stack.search("FFVII"));
        
        // // stack may run outta spaces 
        // // java.lang.OutOfMemoryError: Java heap space
        
        // for(int i=0;i<10000000;i++){
        //     stack.push("Fallout 76");
        // }
        
        System.out.println(stack); 
        
        
        // // uses of stack 
        
        // // 1. undo redo features 
        // // 2. moving back or forward through browser history 
        // // 3. backtrackking algorithms (maze, file directories )
        // // 4. calling functions (call stack implementation)

        // // // ADDING MORE HERE 
        
    }
}
