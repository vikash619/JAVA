package first;

import java.util.Scanner;

class Find{

    public int findmin(int arr[])
    {
        System.out.println();
        int min = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    
    public int findmax(int arr[])
    {
        System.out.println();
        int max = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
public class Array4 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int size;
        System.out.println("Enter the size of Array :");
        size = sc.nextInt();
        
        int arr[] = new int[size];
        
        for(int i = 0; i<size; i++)
        {    
            arr[i] = sc.nextInt();        
        }
        
        System.out.println("Elements of Array :");
        
        for(int i = 0; i<size; i++)
        {    
            System.out.println(arr[i]);
        }
        
        Find f = new Find();
        
        int minimum = f.findmin(arr);
        int maximum = f.findmax(arr);
        
        System.out.println("Minimum : "+minimum);
        System.out.println("Minimum : "+maximum);
        
    }
}
