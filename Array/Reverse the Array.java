package first;

import java.util.Scanner;

class Reverse {
    public void reverseArr(int arr[])
    {
        for(int i = arr.length-1; i >=0 ; i--)
        {
            System.out.println(arr[i]);
        }
    }
}

public class Array5 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int size;
        System.out.println("Enter Size of Array : ");
        size = sc.nextInt();
        
        int arr[] = new int[size];
        
        System.out.println("Enter the elements in Array :");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println();
        Reverse r = new Reverse();
        System.out.println("Reverse of Array :");
        r.reverseArr(arr);
    }
}
