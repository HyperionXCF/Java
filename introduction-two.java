import java.util.*;

class main{
    public static void main(String[] args){
        // homework problems
        // print square of all elements of an array 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        for(int i :arr){
            System.out.print(i*i + " ");
        }
        
        // find the common elements in 2 arrays and put them into third array 
        System.out.println("enter the size of array 1 :");
        int n1 = scan.nextInt();
        System.out.println("enter the size of array 2 :");
        int n2 = scan.nextInt();
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        for(int i=0;i<n1;i++){
            a1[i] = scan.nextInt();
        }
        for(int i=0;i<n2;i++){
            a2[i] = scan.nextInt();
        }
        System.out.println("first array is : ");
        for(int i:a1){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("second array is : ");
        for(int i:a2){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("array with common elements is : ");
        int[] arrnew = new int[n1+n2];
        int k=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(a1[i] == a2[j]){
                    arrnew[k] = a1[i];
                    k++;
                }
            }
        }
        
        for(int i:arrnew){
            if(i!=0){
                System.out.print(i+ " ");
            }
        }
        
        find maximum and minimum elements in a array
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int N = scan.nextInt();
        int[] arr3 = new int[N];
        for(int i=0;i<N;i++){
            arr3[i] = scan.nextInt();
        }
        System.out.println();
        System.out.println("your entered array is :");
        for(int i:arr3){
            System.out.print(i+" ");
        }
        System.out.println();
        int max = arr3[0];
        int min = arr3[0];
        for(int i=0;i<N;i++){
            if(arr3[i] > max){
                max = arr3[i];
            }else if(min > arr3[i]){
                min = arr3[i];
            }
        }
        System.out.println("maximum element is : "+ max);
        System.out.println("minimum element is : "+ min);
        
        reversing an array 
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int N = scan.nextInt();
        int[] arr4 = new int[N];
        System.out.println("enter all elements in single line : ");
        for(int i = 0;i<N;i++){
            arr4[i] = scan.nextInt();
        }
        int l = 0;
        int r = N-1;
        // here l should be less than r, because if l > r then we have passed the midpoint of the array and we will again get original array.
        while(l<r){
            int temp = arr4[l];
            arr4[l] =  arr4[r];
            arr4[r] = temp;
            l++;
            r--;
        }
        System.out.println("reversed array is :");
        for(int i:arr4){
            System.out.print(i + " ");
        }
        
        find the difference between sum of even and sum of odd elements in arrays
        
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        System.out.println("enter your array below : ");
        for(int i=0;i<N;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Entered array is : ");
        for(int i:arr){
            System.out.print(i +  " ");
        }
        int even  =0;
        int odd  =0;
        System.out.println();
        for(int i=0;i<N;i++){
            if(arr[i]%2==0){
                even+=arr[i];
            }else{
                odd+=arr[i];
            }
        }
        System.out.println(even-odd);
        
        checking is array in strictly increasing or decreasing order
        
        for an array to be strictly increase, a[i-1] should be < a[i]
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("enter your elements : ");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        boolean inc = true;
        for(int i=1;i<n;i++){
            if(arr[i] <= arr[i-1]){
                inc = false;
                break; 
            }
        }
        System.out.println(inc);
        
    }
}

class ForLoop{
    public static void ForLoop(String[] args){
        // for each loop == enhanced for loop 
        Scanner scan = new Scanner(System.in);
        // this is how to declare and initialise the array in one line.
        int[] arr = new int[]{1,2,3,4,5};
        // there is no way to access the index of the element here, cant be used to populate the array. 
        for(int i:arr){
            System.out.print(i + " ");
        }
        
    }
}

class LinearSearch{
    public static void LinearSearch(String[] args){
        // linear search in array, returns the index of first occurance only because we iterate from right to left, for Last occurance just iterate array from reverse 
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int N = scan.nextInt();
        int[] arr = new int[N];
        System.out.println("enter you elements : ");
        for(int i=0;i<N;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("this is your entered array :");
        for(int i=0;i<N;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("enter you element to search : ");
        int target = scan.nextInt();
        int ans = -1;
        for(int i=0;i<N;i++){
            if(arr[i] == target){
                ans = i;
            }
        }
        if(ans != -1){
        System.out.println("target element found at index = " + ans);
        }else{
            System.out.println(ans);
        }
        
    }
}

class findingiftargetcanbereachedwithelementsfrom2arrays{
    public static void yash(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of elements in array :");
        int N = scan.nextInt();
        int[] arr = new int[N];
        System.out.println("enter your elements one by one :");
        for(int i=0;i<N;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("your entered array is : ");
        for(int i=0;i<N;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("enter your target sum : ");
        int target = scan.nextInt();
        boolean found = false;
        for(int i =0;i<N;i++){
            for(int j=1;j<N;j++){
                if(arr[i] + arr[j] == target && i!=j){
                    System.out.println(i+" " +j);
                    found = true;
                    break;
                }
            }
        }
        if(found == true){
            System.out.println("target achieved!");
        }else{
            System.out.println("target can't be achieved.");
        }
        
    }
}
