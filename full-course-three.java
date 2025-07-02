import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import java.util.HashMap;
import java.lang.IllegalArgumentException;

class Main{
    public static void main(String[] args){
        // // // hangman game
        String word = "pizza";
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;
        
        for(int i=0;i<word.length();i++){
            wordState.add('_');
        }
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Welcome to Java Hangman");
        System.out.println("+++++++++++++++++++++++");
        
        System.out.println(getHangmanArt(3));
        
        
        scan.close();
    }
    
    static String getHangmanArt(int wrongGuesses){
        return switch(wrongGuesser){
            case 0 ->{  """
            
            
            
                        """;
                
            }case 1 ->{ """
                          o
            
            
                        """;
                
            }case 2 ->{  """
                          o
                          |            
            
                        """;
                
            }case 3 ->{  """
                          o
                         /|            
            
                        """;
            }case 4 ->{
                        """
                          o
                         /|\\            
            
                        """;
            }case 5 ->{
                        """
                          o
                         /|\\            
                         /
                        """;
            }case 6 ->{
                        """
                          o
                         /|\\            
                         / \\
                        """;
            }
                
            }
    // skipped with hangman game due to errors in online compilers. 
    // // working with dats and time in java 
    // // localDate, localTime, localDateTime, UTC timestamp
    
    LocalDate date = LocalDate.now();
    System.out.println(date);
    
    // // import java.time.LocalDateTime;
    // // import java.time.LocalDate;
    // // import java.time.LocalTime;
    
    LocalTime time = LocalTime.now();
    System.out.println(time);
    
    // // both date and time 
    
    LocalDateTime datetime = LocalDateTime.now();
    System.out.println(datetime);
    
    // // // UTC 
    Instant instant = Instant.now();
    System.out.println(instant);
    
    // // we can write a custom format for date time 
    LocalDateTime dt = LocalDateTime.now();
     // // need to import datetimeformatter import java.time.format.DateTimeFormatter;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    
    // // formatted date and time 
    String newdt = dt.format(formatter);
    System.out.println(newdt);
    
    // // custom datetime object with a custom date 
    LocalDateTime date1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
    LocalDateTime date2 = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
    
    // // we can compare dates as well 
    
    if(date1.isBefore(date2)){
        System.out.println(date1 + " is earlier than "+date2);
    }else if(date1.isEqual(date2)){
        System.out.println(date2 + " is equal to "+date1);
    }else{
        System.out.println(date2 + " is after "+date1);
    }
    
    // // we can check if dates are equal using date1.isEqual(date2)
    
    // anonymous classes - create only when you want to create a object with unique features, if you want multiple instances with unique feature better create a new class than using anonymous class.
    // it is a class that do not have a name, it can't be reused, its used when we want to add custom behaviour withot habing to create a new class.often used to one time uses like timertask, runnable, callbacks.
    
    Dog dog = new Dog();
    dog.speak();
    
    // // for an unique dog like scooby do. he speaks english, method one override speak method in new class. 
    // // method 2 : do not create a new class just for one object, instead use anonymous class
    
    Dog dog2 = new Dog(){
      // // define any unique features or override existing methods inside the curly brackets only. 
      @Override
      void speak(){
          System.out.println("I speak english!");
      }
    };
    
    dog2.speak();
    
    // // TIMER - class that schedules tasks at specific times or periodically. useful for sending notifications, scheduled updates, repetitive actions.
    
    // // TIMER TASK - represents the task that will be executed by the timer you will extend the timertask class (using anonymous classes) to define your task create a subclass of timertask and override run() method 
    
    // // creating a timer
    Timer timer = new Timer();
    // // creating a timer task 
    TimerTask task = new TimerTask(){
        int count = 3;
        @Override
        // // task is to print hello when the timer says so 
        public void run(){
            System.out.println("hello");
            count--;
            if(count<=0){
                System.out.println("TASK COMPLETE");
                // // and then cancel the timer so that it stops.
                timer.cancel();
            }
        }
    };
    
    // // saying hello after 3 seconds.
    // // doing a task periodically 
    // // timer.schedule(task,delay,period)
    timer.schedule(task,1000,1000); // // 3000 ms  
    
    // CREATING A COUNTDOWN TIMER. 
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the time : ");
    int response = scan.nextInt();
    
    Timer timer = new Timer();
    TimerTask task = new TimerTask(){
        
        int start = response;
        @Override 
        public void run(){
            System.out.println(start);
            start--;
            if(start<=0){
                System.out.println("Happy New Year!");
                timer.cancel();
            }
        }
    };
    
    // timer.schedule(task,0,1000);
    // // or 
    timer.scheduleAtFixedRate(task,0,1000);
    
    
    // GENERICS - is a programming concept in which we can write a class interface or a method that is compatible with different data types. 
    // <T> type parameter (placeholder that gets replaced with a real datatype)
    // <String> - type argument - it specifies the data type
    
    ArrayList<String> fruits = new ArrayList<>();
    // // here we have specified the type argument to be string
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("banana");
    
    System.out.println(fruits);
    
    ArrayList<Boolean> boolList = new ArrayList<>();
    boolList.add(true);
    boolList.add(false);
    boolList.add(false);
    
    System.out.println(boolList);
    
     // // now we will write a generic class box.
     
     // // creating box object
     // // here we are specifying that ouw box object will store string.
     Box<String> box = new Box<String>();
     
     box.setItem("Banana");
     System.out.println(box.getItem());
     
     Box<Integer> box1 = new Box<>();
     box1.setItem(3);
     System.out.println(box1.getItem());
     
     // // we can have 2 or more type parameters !
     // // creating new generic class product.
     
     Product<String, Double> product = new Product<>("MakeUp Kit",99.99);
     System.out.println(product.item);
     System.out.println(product.price);
     System.out.println(product.getItem());
     System.out.println(product.getPrice());
     
     Product<String, Double> product1 = new Product<>("Ticket",12.99);
     
    
     System.out.println(product1.getItem());
     System.out.println(product1.getPrice());
      
      
     // // HASHMAPS IN JAVA 
     
     // // a data structure which stores key value pairs, key are unique, and values can be duplicated, not order is maintained, it is very memory efficient, 
     // // HashMap<Key,Value>
     
     // // creating a hashmap 
     
     // // string as the key and double as the value.
     HashMap<String,Double> map = new HashMap<>();
     
     // // hashmap methods 
     map.put("Apple",0.59);
     map.put("Banana",0.39);
     map.put("KashiFal",0.69);
     map.put("Orange",0.75);
    //  map.put("Orange",15); // this given input error because value is integer instead of double. 
     map.put("Orange",1000.00); // // putting a duplicate key will only update the value in the hashmap
     
     // // map.remove(key) method to remove the key from the hashmap 
     
     map.remove("Apple");
     
     
     // // printing the hashmap 
     
     System.out.println(map); // // {Apple=0.59, Orange=0.75, Banana=0.39, KashiFal=0.69}
     
     // // getting the value of a key using get method 
     
     System.out.println(map.get("Orange"));
     
     // // checking if a key exists in the hashmap - returns boolean  
     
     System.out.println(map.containsKey("Apple"));
     System.out.println(map.containsKey("Banana"));
     System.out.println(map.containsKey("Pineapple"));
     
     // // usage 
     
     if(map.containsKey("Apple")){
         System.out.println(map.get("Apple"));
     }else{
         System.out.println("Key not found!");
     }
     
     // // checking if a particular value exists in the map using /
     // // map.containsValue(value);
     
     System.out.println(map.containsValue(0.59));
     
     // // size of a map -- size of map is equal to the number of keys present in it.
     
     System.out.println(map.size());
     
     // // printing a map with iteration 
     System.out.println(map.keySet()); // // this returns a iterable set of all the keys present in the map
     
     
     // // iterating over the map and printing the key value of each key present in the hashmap 
     for(String key : map.keySet()){
         System.out.println(key + " : $" + map.get(key));
     }
     
    
    // enumerations or ENUMS -- a special kind of class where we declare constants. 
    // is a special kind of class that represents a fixed set of constants. 
    // they improve code readibility and are easy to maintain
    // they are more efficient with switches rather than comparing string. 
    
    // // creating a day object using enum class.
    
    Day day = Day.SUNDAY;
    System.out.println(day);
    System.out.println(day.getDayNumber());
    
    // // using with switch 
    
    switch(day){
        case MONDAY, TUESDAY, WEDNESDAY, THURSDAY,FRIDAY -> {
            System.out.println("today is weekday");
        }
        case SUNDAY, SATURDAY ->{
            System.out.println("it is weekend");
        }
    }
    
    // // taking user input
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("enter a day of the week : ");
    String response = scan.nextLine().toUpperCase();
    
    
    try{
        Day day1 = Day.valueOf(response);
    
        switch(day1){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY,FRIDAY -> {
                System.out.println("today is weekday");
            }
            case SUNDAY, SATURDAY ->{
                System.out.println("it is weekend");
            }
        }
    }catch(IllegalArgumentException e){
        System.out.println("enter valid day !");
    }
    
    
    // // what happends if we put java.lang.IllegalArgumentException: No enum constant Day.PIZZA
    
    
    // START FROM ::: https://youtu.be/xTtL8E4LzTQ?si=_tmL2WZZQjmYwnue&t=40678
    
    
    }
}

// // ENUM class 

enum Day{
    // // enum constants are uppercase 
    // // sunday will have a value of 1 
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6),SATURDAY(7);
    
    private final int dayNumber;
    
    // // constructor
    
    Day(int dayNumber){
        this.dayNumber = dayNumber;
    }
    
    // // getter method
    
    public int getDayNumber(){
        return this.dayNumber;
    }
}


// // we can keep anything in the box, string boolean, lists etc basically a container.
class Box<T> {
    // // box class is reusable and can be used to store all sorts of things.
    T item; // // String item if type will be string.
    
    // // method to set item
    public void setItem(T item){
        this.item = item;
    }
    
    // // method to get item
    public T getItem(){
        return this.item;
    }
}

class Product<T,U>{
    T item;
    U price; // price could be int float double etx
    
    // // constructor
    
    Product(T item, U price){
        this.item = item;
        this.price = price;
    }
    
    // // creating methods to get and set items 
    
    public T getItem(){
        return this.item;
    }
    public U getPrice(){
        return this.price;
    }
    
}

class Dog{
    void speak(){
        System.out.println("woof woof");
    }
}
