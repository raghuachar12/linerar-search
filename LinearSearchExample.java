import java.util.Scanner;

public class LinearSearchExample{    
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){
    	
    	 int n, sum = 0,key;
         Scanner in = new Scanner(System.in);
         System.out.print("Enter no. of elements you want in array:");
         n = in.nextInt();
         int a1[] = new int[n];
         System.out.println("Enter all the elements:");
         for(int i = 0; i < n; i++)
         {
             a1[i] = in.nextInt();
             sum = sum + a1[i];
         }
         System.out.print("enter the key element to be searched ");
         key = in.nextInt();
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
    	 
    }    
} 