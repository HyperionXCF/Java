import java.util.*;

class Main{
    public static void main(String[] args){
        // string and char arrays 
        // both store characters but differ in properties
        //declaring character array
        char[] arr = {'h','e','l','l','o'};
        System.out.println(arr);
        // strings are immutable have various builtin methods, string pool
        // but char arrays are mutable, no builtin methods,stored in heap
        String str = "Hello world";
        char[] arr2 = str.toCharArray();
        System.out.println(arr2);
        // converting character arrays to string
        String str2 = new String(arr);
        System.out.println(str2);
        
    }
}

class Palindrome2{
    public static void palindrome2(String[] args){
        // another method 
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if (sb.toString().equals(str)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

class Palindrome {
    public static void palindrome(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        boolean is = false;
        int l = 0;
        int r = a.length()-1;
        while(l<r){
            if(a.charAt(l) == a.charAt(r)){
                is = true;
            }
            l++;
            r--;
        }
        System.out.println(is);
    }
}
