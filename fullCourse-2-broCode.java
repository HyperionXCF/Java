import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;

class Main {
    public static void main(String[] args) {
        // // abtraction - hiding implementation details 
        // // abstract - methods and classes, // abstract classes can't be instantiated directly (we can't create any objects of shape class but we can create the objects of its child classses which must implement the abstract methods mentioned in the abstract class), they can contain abtract methods which must me implemented in its child classes, they can also contain concrete methods which are inherited like normal methods.
        
        Circle c = new Circle(3);
        Triangle t = new Triangle(4,5);
        Rectangle r = new Rectangle(6,7);
        
        c.display();
        t.display();
        r.display();
        
        System.out.println(c.area());
        System.out.println(t.area());
        System.out.println(r.area());
        
        
        // // INTERFACE - similar to abstract class
        // // an interface is a blueprint for a class. it has all the abstract methods that implementing classes MUST define. we can have multiple inheritance like behaviour
        // // inheritance - a class can have a single parent but 
        // // interface - a class can have a multiple parents
        
        // //  INTERFACES 
        Rabbit r = new Rabbit();
        r.flee();
        
        Hawk hawk = new Hawk();
        hawk.hunt();
        
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
        
        // // POLYMORPHISM 
        // // POLY = many, morph = shapes
        // // objects can identify as other objects of different types
        // // dog object can be identified as dog object, animal object, organism object and a normal default object as well ! 
        // // polymorphism can also be achieved using interfaces... 
        
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();
        
        car.go();
        bike.go();
        boat.go();
        
        // // creating an array of objects 
        
        Car[] cars = {car,bike,boat}; 
        Bike[] cars = {car,bike,boat}; 
        Boat[] cars = {car,bike,boat}; 
        
        // // ERROR!
        // // Main.java:51: error: incompatible types: Bike cannot be converted to Car
        
        // // but what we can do it set the datatype of the array such that bike, car and boat has it in common == > vehicle!
        
        Vehicle[] vehicles = {bike,car,boat};
        // car identfies as car but also as a vehicle. similarly with bike and boat. 
        
        for(Vehicle v : vehicles){
            // System.out.println(v); // this will refer to memory addresses.
            v.go(); // works 
        }
        
        // //   RUNTIME POLYMORPHISM aka DYNAMIC POLYMORPHISM 
        // // when the method that gets executed is decided at runtime based on the actual type of the object ???? 
        
        // Animal animal = new Animal(); // // Gives error 
        // // what if we want to create dog or cat based on user input ? 
        // // just declare animal obj but not instatiate it.  we will assign animal = new cat() or new dog() based on user input. 
        Animal animal;
        
        // // offcampus - websites 
        // // hiring drives of MAANGS
        // // referral thru seniors 
        // // cold emails to founder needs proof of work. 
        // // startups which raised funds recently are mostly gonna in a hiring spree... 
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Cat or Dog ? 1 = cat / 2 = dog : ");
        int choice = scan.nextInt();
        
        if(choice ==1 ){
            animal = new Dog();
            animal.speak();
        }else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }else{
            System.out.println("Bad Request");
        }
        
        
        // // GETTER AND SETTER METHODS 
        
        // // they help protect object data and add rules to accessing or modifying object data.
        
        Car2 car2 = new Car2("Charger","yellow",10000);
        // // attributes of car2 class are publically available and can be changed. 
        // // car2.model = "Corvetter"; // this will simply change the model of the car, we do not want the info of car to be able to be changed once after its declared. add access modifiers to attributes in class for this.
        // // after changing the access modifiers of the attributes to private we will get following msg after trying to print the below line 
        // // System.out.println(car2.color + " " + car2.model + " " +car2.price );
        // // Main.java:107: error: model has private access in Car2
        
        // private attributes can not be accessed out side the car2 class, but there is a way around, - getter and setter methods 
        
        // GETTER Methods - methods that make a field readable;
        // SETTER Methods - methods that make a field writeable
        // for private attributes.
        
        // calling getter methods to read private attributes of a class
        System.out.println(car2.getColor() + " " + car2.getModel() + " " +car2.getPrice() );
        
        // // GETTER METHODS OF A CLASS ALLOWS FOR US TO READ THE PRIVATE ATTRIBUTES. 
        
        // // TESTING SETTER METHODS OF CAR2 CLASS
        // car2.color = "blue";
        // car2.price = 20000; 
        // these above statements will generate errors Main.java:124: error: color has private access in Car2
        // car2.color = "blue";
            // ^
        // ERROR!
        // Main.java:125: error: price has private access in Car2
        //         car2.price = 20000;
        
        
        // THEREFORE USE SETTER METHODS 
        
        car2.setPrice(20000);
        car2.setColor("blue");
        
        // using getter methods to get the information 
        
        System.out.println(car2.getColor() + " " + car2.getModel() + " " +car2.getPrice() );
        
        from starting to 141 is one comment chunk. uncomment it. 
        
        // // CHUNK 2 
        
        // // AGGREGATION 
        // // an object can contain another object but those objects can exist independently as well. 
        
        // // AGGREGATION EXAMPLES,
        // // creating multiple book objects
        
        Book book1 = new Book("Harry Potter",545);
        Book book2 = new Book("David Goggins",234);
        Book book3 = new Book("The Purle Crayon",124);
        Book book4 = new Book("The Two Towers",352);
        
        // // creating array of book objects
        Book[] books = {book1,book2,book3,book4};
        
        // // iterating over the books array 
        for(Book book : books){
            System.out.println(book.displayInfo());
        }
        
        // // creating library object to contain book objects 
        Library library = new Library("Book House",1998,books);
        
        // // library objects has books objects, this is aggregation 
        library.displayInfo();
        
        // // COMPOSITION - represents a part-of relationship between objects, objects being part of another objects, this definitely means if one object is deleted / removed the super0bject will be affected unlike the concept of aggregation
        
        // // engine is a part of car and engine will have its own parts as well. composition allows complex objects to be constructed from smaller objects.
        
        // constructing car object after composing engine object inside the car constructor.
        
        Car3 car3 = new Car3("Corvette",1998,"V8");
        // // car3.engine is an object so sout-ing car3.engine will give the memory address of the engine object. so further we will use dot operator to access type of engine.
        System.out.println(car3.model + " " + car3.year + " " + car3.engine.type);
        
        car3.start();
        
        // key difference btw aggregation and composition is that if we delete car object then engine object will be deleted as well. whilst in aggregation these 2 objects can exist independently
        
        
        // // WRAPPER CLASSES 
        // wrapper classes allows primitive values like int, double, float, character boolean to be used as objects, which then allows us to use collection frameworks and static utility methods. 
        // newest methods to wrap primitives in objects is done with autoboxing. 
        // we generally do not wrap primitives unless and untill we have to use collection framework on them. 
        
        // old way 
        
        Integer a = new Integer(123); // // a is object and 123 is its value...
        Double b = new Double(3.14);
        Character c = new Character('A');
        Boolean d = new Boolean(true);
        
        // // autoboxing 
        Integer a = 123; // // directly assigning value to objects.
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;
        String e = "pizza";
        
         // // these wrapper classes integer, double, character ... have built in useful utility methods.
        
        // // unboxing - converting objects to primitives
        int x = a; // setting primitive variable to its objects is called unboxing hehe.
        char z = c;
        
        // methods 
        // toString method to convert primitive datatypes to string. 
        
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('@');
        String d = Boolean.toString(false);
        
        String x = a+ b+c+d;
        System.out.println(x);
        // this will give a long string due to concatenation. 
        
        // Converting string to primitives
        
        int a = Integer.parseInt("12345");
        double b = Double.parseDouble("3.124");
        char c = "Pizza".charAt(0); // // charcter doesn't have a parse char methods. so use charAt(idx)
        boolean d = Boolean.parseBoolean("true");
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        // // few more utility methods
        
        char letter = 'b';
        // // checking if character is a character. by utilising the methods from Character wrapper class. this returns a boolean.
        System.out.println(Character.isLetter(letter));
        // // static utility method of character class 
        System.out.println(Character.isUpperCase(letter)); // // returns a boolean value.
        
        
         // // ARRAYLIST only works with objects. 
         // array list is a resizeable array that stores objects (primitives can be stored if autoboxxed.) arrays are fixed in size but ArrayLists can change their size as per the need. they are dynamic.
         
         // // step1 : import java.util.ArrayList;
         ArrayList<Integer> list = new ArrayList<>(); // // no need to mention the datatype again in the second diamond operator. 
         
         // // listname.add(<element>) is the inbuilt method to add an element to the listname
         
         list.add(121);
         list.add(22);
         list.add(63);
        
        System.out.println(list); // // [1,2,3]
        
        // // Double array 
        ArrayList <Double> list2 = new ArrayList<>();
        list2.add(3.14);
        list2.add(3.15);
        list2.add(3.16);
        
        System.out.println(list2);
        
        // // arraylist of string 
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("kiwi");
        fruits.add("brotato");
        
        System.out.println(fruits);
        
        // // listname.remove(index); to remove the element 
        
        fruits.remove(0);
        System.out.println(fruits);
        
        // // listname.set(index,newValue); set method to reassign some value in the arrayList. 
        
        fruits.set(1,"strawberry");
        
        System.out.println(fruits);
        
        // // accessing an element at certain index use square bracket notation listname[index]; or listname.get(indx) method 
        fruits.get(0);
        fruits.get(1);
        fruits.get(2);
        
        // // size of array list == no of elements in it. 
        System.out.printf("%d \n",fruits.size());
        
        // // using collections framework sort method to sort the array 
        // // step 1 : import java.util.Collections;
        // // step 2 : use Collections.sort(<listname>) method to sort the array
        
        Collections.sort(fruits);
        System.out.println(fruits); 
        
        // // string arraylist will be sorted in alphabetical order. 
        // // integer and double list will be sorted in ascending order.
        Collections.sort(list);
        System.out.println(list);
        
        // // using an enhanced for loop to iterate over arrayList 
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        
        // taking user inputs in an array list. 
        Scanner scan = new Scanner(System.in);
        
        ArrayList<String> foods = new ArrayList<>();
        System.out.print("enter the number of items you want to store: ");
        int num = scan.nextInt();
        scan.nextLine(); // // to stop \n from getting accepted as the first input. this is also called as clearing input buffer. 
        
        for(int i=0;i<num;i++){
            System.out.print("enter the item no. "+(i+1) + " : ");
            String item = scan.nextLine();
            foods.add(item);
        }
        
        System.out.println(foods);
        
        scan.close();
        
        // // EXCEPTION HANDLING USING JAVA 
        // an exception is an event that interrupts that normal flow of a program, dividing by zero, file not found, mismatch input type, the surround the code with a try{} block.
        
        System.out.println(1/0); // Exception in thread "main" java.lang.ArithmeticException: / by zero at Main.main(Main.java:335)
        
        // if we have a try block then we also require catch block to catch the exception, we will list the specific type of exception that we might except in the catch() 
        
        // ArithmeticException e, here e is the identifier of the exception,
        Scanner scan = new Scanner(System.in);
        // // every time we accept an user input its always a dangerous code. so surround it by try catch.
        try{
            System.out.println(1/0); // // any code that might produce an exception should be inside try catch block.
            
            // // we can add multiple catch block to handle each exception differently. 
        }catch(ArithmeticException e){
            System.out.println("YOU CANT DIVIDE BY ZERO");
        }
        
        // // example 2 InputMismatchException
        
        try{
            System.out.print("enter a number : ");
            int number = scan.nextInt();
            System.out.println(number);
        }catch(InputMismatchException e){ // // need to import java.util.InputMismatchException;
            System.out.println("that wasn't a number ~");
        }catch(Exception e){
            // // use this to catch all sort of exceptions that might occur, this acts as a safety net. this is only for something that you didnot anticipated.
            System.out.println("Something went wrong");
        }finally{
            // // finally block will always execute whether there is an exception or not. 
            // // this is mostly used to clean up memory or close a scanner, or to close a file. this block will always executes. 
            scan.close();
            // // often used to clean up your program after done using it. 
            // // or to clean input buffer.
        }
        
        // it is good practice to write descriptive errors for users to understand. 
        
        // // example 3 - opening a file with try block, then using finally block to close the file to avoid data corruption. 
        
        // // party trick. try ith resources 
        
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("enter name : ");
            String name = scan.nextLine();
        }catch(InputMismatchException e){
            System.out.println("that wasn't a string !");
        }catch(Exception e){
            System.out.println("Something went wrong");
        }finally{
            System.out.println("Resources automatically cleaned at the end");
        }
        
        // using try with resources automatically closes all the resources after the finally block in the code.  
        
        
        // // WRITE FILES
        // // WAY 1 : using FileWriter object - small / med text size
        // // WAY 2 : BufferedWriter - better performance for large text
        // // WAY 3 : PrintWriter - best for structured data like reports or logs
        // // WAY 4 : FileOutputStream - best for binary files images, audio files.
        
        // import java.io.FileWriter;
        
        // we can also pass absolute file paths or relative file paths in the constructor, use \\ 
        
        // for better organisation creating new identifiers for filepath and textcontent.
        
        String lotOfText = """
        this is used when we have multi
        line text that spans over few lines
        this is how you do it.
        """;
        String filePath = "filepath.txt";
        String textContent = "this is a string which is been passed into the write() method of writer object!";
        
        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }catch(FileNotFoundException e){
            // // if theres a problem write the file, catch block will catch the exception.
            // // we are required to import java.io.IOException as well.
            System.out.println("could not write the file");
        }catch(IOException e){
            // // use when file not found or file path is wrong !
            // // we are required to import this exception as well. java.io.FileNotFoundException;
            System.out.println("File not found !");
        }catch(Exception e){
            System.out.println("Something went wrong !");
        }
        
        
        // // Reading files using java. 
        // 3 methods 
        // 1 - BufferedReader & FileReader - best for reading text files line by line.
        // 2 - FileInputStream - best for binary files (imgs audios);
        // 3 - RandomAccessFile - best for read write specific portion of a large file. 
        
        // we need to import java.io.BufferedReader; & import java.io.FileReader; to use these.
        
        String filePath = "filepath.txt";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            // // when using try block with resources we will automatically close this object / memory after work's done.
            System.out.println("file exists");
            String line; // // we are reading the file line by line.
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            // // after reading one line the reader will point to next line but if the next line doesn't exists, then readLine() method will return null, so while line is not null we will read from the file. 
            
        }catch(FileNotFoundException e){
            System.out.println("File not Found!");
        }catch(Exception e){
            System.out.println("Something went wrong !");
        }
        
        // SHOULD PROBABLY NOT DO MUSIC PLAYER USING JAVA AND HANGMAN VIDEO SKIPPING FOR RIGHT NOW!
        
        
    }
}
// // COMPOSITION CONCEPT 
// // need to create car3 class

class Car3{
    
    // // attributes of car3 class
    String model;
    int year;
    Engine engine; // // engine object
    
    // // constructor 
    // // we will not directly pass the engine object, but we will pass the type of engine string.
    Car3(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        // // while constructing a new car object we are also constructing new engine object.
        this.engine = new Engine(engineType);
        // // head over to engine class from here
    }
    
    // // methods
    
    void start(){
        // // when the car starts, the engine starts too !
        this.engine.start();
        System.out.println("The "+this.model + " is running");
    }
}
class Engine{
    // // attribute
    
    String type;
    
    // // constructor
    
    Engine(String type){
        this.type = type;
    }
    
     // // methods 
     void start(){
         System.out.println("wroom wroom !");
         System.out.println("You've started the "+this.type);
     } // // similarly creating a start method for car class.
    
    // // now we will construct car object.
}

// // AGGREGATION - represents a has-a relationships between objects,
// // library will contain book objects but book and library can exist without each other thats aggregation. 
class Library{
    String name;
    int year;
    // // library will have an array of book objects
    Book[] books;
    
    // // constructor 
    Library(String name,int year,Book[] books){
        this.name = name;
        this.year = year;
        this.books = books; // array 
    }
    // // METHODS
    // // this library has aggregated many book objects 
    // // now we will use them for something.
    
    void displayInfo(){
        System.out.println(this.year + " is the year in which " + this.name + " was established, and now it has " + this.books.length + " books");
        System.out.println("Books available : ");
        for(Book book : books){
            System.out.println(book.displayInfo());
        }
    }
    
    // // here we are using book method (display info) inside the for loop. 
    
    // // thats aggregation for you ladies and gentlemens. 
    
}
// // if we deleted library class books will not be affected... & can exist independently. 
// // this is a key difference between COMPOSITION. 
class Book{
    String title;
    int pages;
    
    // Constructor
    Book(String title,int pages){
        this.title = title;
        this.pages = pages;
    }
    
    // Methods
    String displayInfo(){
        return this.title + " " + this.pages + " pages.";
    }
}

// // ABSTRACT CLASSES
// // we cannot create objects of Shape class because its abstract
abstract class Shape{
    // we can only declare the abstract methods, abstract methods cannot have body. they are overriden & implemented in its child class
    abstract double area();
    
        
    // implementing a concrete methods 
    void display(){
        System.out.println("this is a shape");
    }
}

// // we can create objects of below classes.
class Circle extends Shape{
    
    double radius;
    
    // constructor 
    Circle(double radius){
        this.radius = radius;
    }
    // implementing abstract methods 
    @Override 
    double area(){
        return Math.PI*radius*radius;
    }
}
class Triangle extends Shape{
    double b;
    double h;
    
    Triangle(double b,double h){
        this.b = b;
        this.h = h;
    }
    @Override 
    double area(){
        return 0.5*b*h;
    }
}
class Rectangle extends Shape{
    
    double l;
    double w;
    
    Rectangle(double l, double w){
        this.l = l;
        this.w = w;
    }
    @Override 
    double area(){
        return l*w;
    }
}

// // INTERFACES HERE 
// // In Java, when declaring methods within an interface, you don't need to explicitly use the abstract keyword. By default, all methods declared in an interface are implicitly abstract and public. You can omit the abstract keyword without causing any compilation errors. 

// // all the classes implementing a prey interface must have a method to flee and all the classes implementing a predator interface must have a method to hunt. 

interface Prey{
    void flee();
}
interface Predator{
    void hunt();
}
// // creating classes implementing interfaces

// // rabbits are mostly preys it will implement prey interface 
class Rabbit implements Prey{
    @Override
    public void flee(){
        System.out.println("rabbit is running away");
    }
}
// // fishes can be prey and predator boths ! so its implements prey and predator both 
class Fish implements Prey, Predator{
    
    @Override
    public void flee(){
        System.out.println("The fish is swimming away!");
    }
    
    @Override 
    public void hunt(){
        System.out.println("the fish is hunting!");
    }
    
}
class Hawk implements Predator{
    // hawk will implement predator interface
    @Override 
    public void hunt(){
        System.out.println("Hawk is hunting.");
    }
}

// // POLYMORPHISM EXAMPLES 

abstract class Vehicle{
    abstract void go();
}

// different types of vehicles
class Car extends Vehicle{
    @Override 
    void go(){
        System.out.println("you are driving the car");
    }
}

class Bike extends Vehicle{
    @Override 
    void go(){
        System.out.println("you are riding the bike");
    }
}

class Boat extends Vehicle{
    @Override 
    void go(){
        System.out.println("you are sailing the boat");
    }
}


// // RUNTIME ANIMAL 
// // since animal is an abstract class we can't create an animal object.
abstract class Animal{
    // // abstract method 
    abstract void speak();
}
class Dog extends Animal{
    @Override 
    void speak(){
        System.out.println("the dog goes woof");
    }
}
class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("the cat goes meow");
    }
}

// // GETTER AND SETTER EXAMPLES 

class Car2{
    private final String model; // final keyword to make sure this attribute is not writeable ever...
    private String color;
    private int price;
    
    // constructor 
    Car2(String model,String color,int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }
    
    // // after changing the access modifiers of the attributes to private we will get following msg after trying to print the below line 
        // // System.out.println(car2.color + " " + car2.model + " " +car2.price );
        // // Main.java:107: error: model has private access in Car2
        
        // private attributes can not be accessed out side the car2 class, but there is a way around, - getter and setter methods 
        
        // GETTER Methods - methods that make a field readable;
        // SETTER Methods - methods that make a field writeable
        // for private attributes.
        
        // // follow this naming convection please. 
        String getModel(){
            return this.model;
        }
        String getColor(){
            return this.color;
        }
        
        // // modifying the getPrice method's return type to String to send $ sign with it
        // // we can add additional logic to the getter and setter methods too. 
        String getPrice(){
            return "$" + this.price;
        }
        
        // call getter methods to read private information from a class.
        
        
        // // if we do not want a class attribute to writable once we have declared it we use private access modifier. 
        // // incase we want to change the private attributes after  declaration we use SETTER Methods.
        
        // // SETTER METHODS
        // // we do not want the model to be changed once its declared but color and price can be changed so we are creating setter methods for color and price attributes. 
        
        void setColor(String color){
            this.color = color;
        }
        void setPrice(int price){
            // // adding a price check in set method 
            if(price < 0){
                System.out.println("Price cannot be negative");
            }else{
                this.price = price;
            }
        }
        
        // // when we do not want a attribute to be writeable we can use final keyword. 
        // // private final String Model; 
}

