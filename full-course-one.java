
class Main{
    public static void main(String[] args){
        objects - an entity that holds data (attributes) and can perform actions (methods) it is a reference data type 
        
        create class
        create object of class
        perform methods or use attributes
        
        Car mustang = new Car();
        System.out.println(mustang); // prints the address of the mustang object
        
        accessing attributes == use dot operator 
        object dot attribute name
        
        System.out.println(mustang.make);
        System.out.println(mustang.year);
        System.out.println(mustang.model);
        System.out.println(mustang.isRunning);
        mustang.start();
        System.out.println(mustang.isRunning);
        mustang.stop();
        System.out.println(mustang.isRunning);
        mustang.drive();
        mustang.brake();
        
        CONSTRUCTORS USED TO PASS IN ARGUMENTS TO OBJECTS
        
        a constructor is a special method used to initialize the objects, we can pass the arguments to the constructor and set up initial values of the attributes in an object which may already have dafault values which can be changed or no values which we are supposed to be assign
        
        Student s1 = new Student("Yash",21,8.72);
        
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gpa);
        
        Student s2 = new Student("vipul",21,8.1);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.gpa);
        
        Student s3 = new Student("Sandy",21,9.9);
        s3.study();
        
        OVERLOADED CONSTRUCTOR
        
        overloaded constructors - different constructors having same name but different parameters list, allows objects to be initialized in various different ways
        attributes with no values simply return default values like null for string 0 for int 0.0 for double etx 
        
        Users user1 = new Users("yash1");
        Users user2 = new Users("yash2","yash@gmail.com");
        Users user3 = new Users("yash3","yash@gmail.com",21);
        
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println(user2.username);
        System.out.println(user3.username);
        
        
        ARRAY OF OBJECTS 
        
        Car car1 = new Car("Mustang","Red");
        Car car2 = new Car("Corvette","Blue");
        Car car3 = new Car("Charger","Yellow");
        
        Car[] cars = {car1,car2,car3};
        
        // iterating over this array of car objects
        // normal for loop
        
        for(int i=0;i<cars.length;i++){
            cars[i].drive();
        }
        
        // enhanced for loop 
        
        anonymous objects --> means objects without any unique identifiers like car1 = new Car(); car1 is unique identifier 
        Car[] cars = {new Car("mustang","Red"), new Car("Alto","Black"),new Car("Nano","yellow")};
        
        // changing all car's color to black using a for loop 
        for(Car car : cars){
            car.color = "black";
        }
        // calling drive() method on all car objects
        for(Car car : cars){
            car.drive();
        }
        
        STATIC KEYWORD
        
        static keyword makes variable or method belong to the class rather than to any specific object, commonly used for utility methods or shared resources.
        
        Friend f1 = new Friend("Madhusudhan");
        System.out.println(f1.name);
        System.out.println(f1.numfren);
        
        Friend f2 = new Friend("Madhura");
        System.out.println(f2.name);
        System.out.println(f2.numfren);
        
        Friend f3 = new Friend("Vipul");
        System.out.println(f3.name);
        System.out.println(f3.numfren);
        
        Friend f4 = new Friend("Atharva");
        System.out.println(f4.name);
        System.out.println(f4.numfren);
        
        Friend f5 = new Friend("peop");
        // accessing the static member using class dot member method 
        // System.out.println("Total Friends : " + Friend.numfren);
        Friend.showFrens();
        
        static members in Math class
        
        System.out.println(Math.round(3.89)); // round is a utility method of Math class
        
        we do not need to create a math object to use round() method like
        Math math1 = new Math();
        
        INHERITANCE = is the way by which one class (child) inherits the attributes and methods of anotehr class (parent)
        
        <childClass> extends <parentClass>
        
        creating dog and cat object 
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        
        dog.eat();
        cat.eat();
        
        only introduce the changes in parent class, and there will be no need to change multiple things in multiple child objects. 
        
        each child class can have its own unique attributes
        
        dog.speak();
        cat.speak();
        
        SUPER keyword - super keyword refers to the parent class, child class is also known as sub class and its parent class is know as super class
        super keyword is used in constructors and method overriding 
        it calls the parent constructor to initialize the attributes 
        
        Person person1 = new Person("Harry","Potter");
        person1.showName();
        
        Student student = new Student("Tom","Riddle",9.72);
        System.out.println(student.gpa);
        student.showName();
        student.showGPA();
        
        
        Emp employee = new Emp("Rubeus","Hagrid",50000);
        
        employee.showSalary();
        
        
    }
}

// All classes here

class Person{
    String first;
    String last;
    
    // constructor
    Person(String first, String last){
        this.first = first;
        this.last = last;
    }
    
    // methods 
    
    void showName(){
        System.out.println(this.first + " " + this.last);
    }
}
// student will extend person class
class Student extends Person{
    double gpa;
    
    Student(String first,String last,double gpa){
        
        // so we need to share the first and last String to the parent class to initialize it also note that call to the super method should be the first statement in the constructor.
        super(first,last);
        
        // this.first = first;
        // this.last = last;
        // we cant assign these attributes as they are not the part of student class
        this.gpa = gpa;
        
    }
    
    void showGPA(){
        System.out.println(this.first + "'s GPA is "+this.gpa);
    }
}
class Emp extends Person{
    int salary;
    
    //constructor
    Emp(String first, String last, int salary){
        super(first,last);
        this.salary = salary;
    }
    
    // methods 
    
    void showSalary(){
        System.out.println(this.first + "'s salary is $"+salary);
    }
}

class Animal{
    boolean isAlive;
    
    //constructor
    Animal(){
        isAlive = true;
    }
    
    void eat(){
        System.out.println("the animal is eating...");
    }
}
// dogs and cats are animal so they will inherit the attributes and methods from Animal class
class Dog extends Animal{
    int lives = 1;
    void speak(){
        System.out.println("Woof");
    }
}
class Cat extends Animal{
    int lives = 9;
    void speak(){
        System.out.println("meow");
    }
}

class Friend{
    // this static variable or method will be shared among all the objects of Friend class... 
    static int numfren;
    String name;
    
    Friend(String name){
        this.name = name;
        numfren++;
    }
    
    // creating a static method 
    static void showFrens(){
        // we do not need this. keyword for static attributes 
        System.out.println("You have "+numfren + " Friends");
    }
}

class Car{
    String make;
    String model;
    int year;
    double price;
    boolean isRunning;
    String color;
    
    // constructors 
    Car(String model,String color){
        this.model = model;
        this.color = color;
        System.out.println("Car created successfully!");
    }
    
    void start(){
        isRunning = true;
        System.out.println("you Started the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("you Stopped the engine");
    }
    
    void drive(){
        System.out.println("you are driving the " + " " +color + " " +model);
    }
    
    void brake(){
        System.out.println("you braked the "+model);
    }
}

class Users{
    String username;
    String email;
    int age;
    
    // constructor to only initialize user object with a username
    Users(String username){
        this.username = username;
    }
    // overloaded constructor - to initialize user object with a username and email
    Users(String username,String email){
        this.username = username;
        this.email = email;
    }
    // overloaded constructor - to initialize user object with a username email and age 
    Users(String username,String email,int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
    
    // having overloaded constructor allows us to initialize objects with different attributes 
}

// class Student{
//     String name;
//     int age;
//     double gpa;
//     boolean isEnrolled;
    
//     // constructor below 
    
//     // constructor is called automatically when we create a new object like 
//     // Student s1 = new -->Student()<--;
    
//     Student(String name,int age,double gpa){
//         this.name = name;
//         this.age = age;
//         this.gpa = gpa;
        
//         // we can also initialize an object with a default value like following :
//         this.isEnrolled = true;
//     }
    
//     void study(){
//         System.out.println(this.name + " is studying");
//     }
    
// }
