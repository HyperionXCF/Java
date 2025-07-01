import java.util.*;

class Main{
    public static void main(String[] args){
        // reversing the string using for loop
        String str3 = "Hello World";
        String nnn = "";
        for(int i=str3.length()-1;i>=0;i--){
            nnn += str3.charAt(i);
        }
        //  reversed string 
        System.out.println(nnn);
        
        // better way is to use stringBuilder class
        // bydefault strings in java are not mutable. so everytime to modify that string we will need to create new string which can consume a lot of space. 
        // therefore we can use StringBuilder class to create mutable (modifiable) strings
        // if no value passed sb will be initialed to empty string 
        StringBuilder sb = new StringBuilder("Yash Dinesh Sonalekar");
        System.out.println(sb);
        
        // appending char or string to the end of sb 
        sb.append(" is the best person");
        System.out.println(sb);
        
        // inserting a string to sb at certain index
        // sb.insert(index,str);
        sb.insert(12,"Deoraoji ");
        System.out.println(sb);
        
        // replacing a string in with new string
        // start index and end index of string which we need to replace with briliant
        sb.replace(29,34,"briliant");
        System.out.println(sb);
        
        // delete method takes starting and end index, deleted string between starting and end 
        
        // converting StringBuilder to string 
        
        String n = sb.toString();
        System.out.println(n.getClass());
    }
}

class string{
    public static void string(String[] args){
        // string methods 
        // charAt(index)
        Scanner scan = new Scanner(System.in);
        String name = "Yash";
        System.out.println("enter the character of index you want to access : ");
        int index = scan.nextInt();
        System.out.println(name.charAt(index));
        
        
        //string.length()
        System.out.println(name.length());
        
        // indexOf('char' or "substring"); returns the index of first occurance, if not present then returns -1
        
        System.out.println(name.indexOf('M'));
        System.out.println(name.indexOf("sh"));
        
        // equals - used to compare if 2 strings contain smae sequence of characters, return true or false
        // it is case sensitive
        
        String name2 = "Yash";
        System.out.println(name2.equals(name));
        
        // string1.contain("string2") - returns true or false
        // this method only takes searching for specified string2 inside the string1 
        // it allows to search for a single character but that char must be passed as a string.
        System.out.println("does the string " + name + " contains sh :  "+name.contains("sh"));
        
        
        // toLowerCase() toUpperCase()
        // returns new string after changing the cases 
        // original string remains intact
        
        System.out.println("changing the cases of string Yash");
        System.out.println(name.toUpperCase());
        // storing new string with new case in new variable 
        String name3 = name.toLowerCase();
        System.out.println(name3);
        
        // s3.string(s1,s2)
        // replaces target(s1) with replacement(s2)
        // returns new string with replaced words
        // note all occurance of target will be replaced with replacement string 
        
        String str = "I love programming, programming is awesome";
        String str2 = str.replace("programming","java");
        System.out.println(str);
        System.out.println(str2);
        
        // str.substring(beginIndex,endIndex);
        // note that endIndex is excluded
        // substring will begin with beginIndex and end at endIndex-1;
        // str.substring(5); - substring starts from index 5 and goes uptil end of original string if endIndex is not specified
        
        String a = "yash";
        String b = a.substring(0,2);
        System.out.println(b);
        
        // string concatenation 
        // can be done using + operator 
        // String + primitive, primitive is converted to string and concatenated 
        // when non primitive datatype is concatenated with string, toString() is called on non primitive automatically 
        
    }
}

class Example{
    public static void example(String[] args){
        // java String class and its objects / methods
        // strings in java are immutable 
        
        // strings are objects of class String in java 
        
        String s = "Hello World";
        System.out.println(s);
        int n = s.length();
        System.out.println("length of string is : "+n);
        
        // strings are indexed as well. use string.chatAt(idx) to access the character
        
        System.out.println(s.charAt(4));
        System.out.println(s.charAt(0));
        
        // string literals (values inside double quotes) are treated as objects so we can call methods directly on the string literals 
        System.out.println("length of the string is : " + "Hello".length());
        
        // string pool is the area in heap memory where the string literals are stored
        
        // strings initialised with new keyword are not stored in string pool, it resides in heap memory outside the pool
        
        String s4 = new String("yash dinesh sonalekar");
        System.out.println(s4);
        
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        
        // since s1 and s2 are having same value and are not initialised using new keyword, they are pointing to same object with value "abc" therefore they show they are equal.
        
        // == checks if both are pointing to same objects in the memory 
        // equals check if both have same content 
        if(s1==s2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        
        // s1 and s3 are different object, if we check s1==s3 we get not equal because it compares the objects and s1 and s3 are different objects. therefore we use s1.equals(s3) method
        // string1.equals(string2) checks if the contents inside the strings are equal 
        if(s1.equals(s3)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
