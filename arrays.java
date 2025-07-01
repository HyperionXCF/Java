import java.util.Scanner;

class Main{
    public static void main(String[] args){
        // output random numbers until 5 occurs
        
        int random = (int)(Math.random()*10 + 1);
        while(random !=5){
            System.out.print(random + " ");
            random = (int)(Math.random()*10 + 1);
        }
        
        // LCM of 2 numbers : 
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for(int i=1;i<=200;i++){
            if(i%a == 0 &&  i%b==0){
                System.out.println(i);
            }
        }
        
        // arrays 
        
        // syntax, declaration and initialisation
        // <datatype> [] <arrayname> = new <datatype>[size];
        int[] arr = new int[10];
        arr[0] = 20;
        
        // initialising array elements using for loop 
        
        // Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i=1;i<arr.length;i++){
            int temp = scan.nextInt();
            arr[i] = temp;
        }
            System.out.print("[");
        for(int i=1;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
            System.out.print("]");
        
        
        float[] arr1 = new float[10];
        String[] arr2 = {"luffy","zoro","sanji"};
        
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }
        
        
        
    }
}
