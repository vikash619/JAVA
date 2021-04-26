package first;

import java.util.Scanner;

class Find1 {
    public int findKth(int arr[], int k)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =  temp;
                }
            }
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            if(i == k)
            {
                return arr[i];
            }
        }
        return -1;
    }
}

public class Array6 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int size,Kth;
        System.out.println("Enter the size of Array:");
        size = sc.nextInt();
        
        
        int arr [] = new int [size];
        
        System.out.println("Enter Elements of Array : ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println();
        System.out.println("Elements of Array : ");
        
        for(int i = 0; i < size; i++)
        {
            System.out.println(arr[i]);
        }
        
        System.out.println();
        System.out.println("Enter the Kth value : ");
        Kth = sc.nextInt();
        
        Find1 f = new Find1();
        int kth = f.findKth(arr, Kth-1);
        
        if(kth != -1)
        {
            System.out.println();
            System.out.println("Kth : "+kth);
        }
        else
        {
            System.out.println();
            System.out.println("Element not found at Kth Location");
        }
        
    }
}
