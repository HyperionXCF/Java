import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        System.out.println("Hello World");
        System.out.print("Hello World");
        System.out.println("Hello World");
        
        int a1 = 10;
        int b1 = 12;
        System.out.println("Sum of a and b is "+ (a1+b1));
        
        int marks;
        marks = 10;
        System.out.println(marks);
        
        // Primitive Data Types - stored in stack - fast
        
        // integers  - byte, short, int, long
        byte a7 = 3;
        short a8 = 46;
        int a9 = 1234;
        long a2 = 1288928289283L;
        // floating points - float, double
        float pi = 3.14f;
        double pie = 3.145354362;
        // boolean, char
        boolean a3 = true;
        boolean a4 = false;
        char a5 = 'A';
        char a6 ='%';
        
        // Non Primitive Data Types - stored in heap - slower
        // String, Classes, Objects, Interfaces, Arrays
        
        String name = "Yash";
        String Address = "Yash Lives near the Pavillion mall";
        System.out.println(name + " " + Address);
        
        class Car{
            String model;
            int year;
            
            Car(String model,int year){
                this.model = model;
                this.year = year;
            }
            
            void displayInfo(){
                System.out.println(model + " " + year);
            }
        }
        
        // object creation 
        Car Alto = new Car("Maruti",2010);
        Alto.displayInfo();
        
        // Array - the size of array must be specified by integers datatype only.
        
        // <datatype>[] <arrayname> = {elements,e1,e2,e3,e4};
        int[] a10 = {1,2,3,4};
        String[] a11 = {"Yash","Dinesh","Sonalekar"};
        System.out.println("the size of a11 array is : " +a11.length);
        
        // String - are objects so they have many methods available to them.
        // multiline strings
        
        String movies = """
                        yash
                        dinesh
                        sonalekar
                        """;
        System.out.println(movies);
        
        // Type casting 
        // (int) (float)
        
        // constants - use final keyword before the datatype of variable
        // final variables can only be initialised once. 
        
        final double PI = 3.1454335;
        final double PIE;
        PIE = 3.14532464; 
        System.out.println(PI);
        
        
        // reading inputs in java - Scanner Class Object
        // first import java.util.Scanner;
        // second create object of scanner class
        Scanner scan = new Scanner(System.in);
        
        int a12 = scan.nextInt();
        System.out.println(a12);
        
        // reading various types of datatypes
        
        int a13 = scan.nextInt();
        float a14 = scan.nextFloat();
        byte a15 = scan.nextByte();
        short a16 = scan.nextShort();
        String a17 = scan.next();  // next() method only reads an input until a whitespace character (space tab : '\t' newline char : '\n');
        boolean a18 = scan.nextBoolean();
        System.out.println(a18);
        
        // java doesn't have any method to read character input so take a string and access its 0th index character to read a character.
        char a19 = scan.next().charAt(0);
        
        class Calculator {
            int a;
            int b;
        
            Calculator(int a, int b) {
                this.a = a;
                this.b = b;
            }
            //You don’t need this because the methods only use the numbers passed to them. Use this only if you want to use the numbers already in the class.
        
            int Add() {
                return a + b;
            }
            int SubtractAfromB() {
                return a - b;
            }
            int SubtractBfromA() {
                return b - a;
            }
        }
        
        
        Calculator Calculate = new Calculator(10,12);
        System.out.println(Calculate.Add());
        System.out.println(Calculate.SubtractBfromA());
        System.out.println(Calculate.SubtractAfromB());
        
        // arithmetic operators : +,-,/,*,%
        // relational operators : >,<,>=,<=,==,!= : returns true,false
        // equality operator : =
        // postfix & prefix operator : ++a,--b,a++,b--
        // compound assignment : +=, -=, *=, /=
        
        
        // if else-if else ladder 
        
        if(3>4){
            System.out.println(3>4);
        }else if(4>3){
            System.out.println(4>3);
        }else{
            System.out.println(4==3);
        }
        
        //SwitchCase
        
        int m1 = 45;
        switch (m1){
            case 10:
                System.out.println("10");
                break;
            case 40:
                System.out.println("40");
                break;
            default:
                System.out.println("failed");
        }
        
        // enhanced or better way of writing switch cases no need to add break statement.
        
        switch(m1){
            case 40 ->{
                System.out.println("this is 40");
            }
            case 45 ->{
                System.out.println("this is 45");
            }
        }
        
        
        char m2 = scan.next().atChar(0);
        switch(m2){
            case 'a','e','i','o','u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
        
        // Ternary Operator 
        
        // boolean result = (condition) ? (output if true) : (output if false);
        
        int x = 5;
        String result1 = (x > 3) ? "Greater" : "Smaller"; // Returns "Greater"
        int result2 = (x > 3) ? 10 : 20; // Returns 10
        boolean result3 = (x > 3) ? true : false; // Returns true
        
        // or 
        
        System.out.println((3>4)?"3 is greater than 4" : "4 is greater than 3");
        
        // logical operators : &&, ||, !
        
        // for loop 
        // for(initialisation;condition;update){}
        
        // printing first 5 numbers
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
        
        // N is no of inputs in second line, find the max element out of N integers;
        
        int N = scan.nextInt();
        int max = 0;
        for(int i=1;i<=N;i++){
            int v = scan.nextInt();
            if(v > max){
                max = v;
            }
        }
        System.out.println(max);
        
        // while loops in java 
        // while(condition){body of loop, update statement};
        // print from 1 to 10 
        int m3 = 1;
        while(m3<=10){
            System.out.println(m3);
            m3++;
        }
        
        //counting digits in a number;
        
        // Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        System.out.println(count);
        
        
        // do while loop - exit controlled loops 
        
        // do{
            // body
            // update statement.
        // }while(condition);
        
        // printing first 10 integers using do while
        do{
            System.out.println(m3);
            m3++;
        }while(m3<=10); // do not forget the semicolon here
        
        // finding the sum of positive numbers in n integers until negative integer occurs.
        
        // Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum = 0;
        while(N>0){
            int to = scan.nextInt();
            if(to<0){
                break;
            }else{
                sum +=to;
            }
            N--;
        }
        System.out.println(sum);
        
    }
}
