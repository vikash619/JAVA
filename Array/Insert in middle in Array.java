package first;

import java.util.Scanner;

class ArrayImplement{
    Scanner sc = new Scanner(System.in);
    
    public void arrayIniti(int arr[], int choice)
    {
        System.out.println("Elements in Array before inserting :");
        
        for(int i = 0; i <choice; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    
    
    public void insertInto(int arr[],int number, int index,int choice)
    {
        
        System.out.println();
        System.out.println("Elements in Array before inserting :");
        for(int i = 0; i < choice; i++)
        {
            System.out.println(arr[i]);
        }
        
        for(int i= choice-1; i >= index; i--)
        {
            arr[i+1] = arr[i];
        }
        
        arr[index] = number;
        
        System.out.println();
        
        System.out.println("Elements in Array after inserting :");
        for(int i = 0; i < choice+1; i++)
        {
            System.out.println(arr[i]);
        }
    }
}


public class Array3 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayImplement ar = new ArrayImplement();
        
        int size = 100;
        int choice;
        System.out.println("How many elements want to enter :");
        choice = sc.nextInt();
        
        
        int arr[] = new int[size];
        
        int number,index;
        System.out.println("Enter number want to insert");
        number = sc.nextInt();
        System.out.println("Enter index where want to insert");
        index = sc.nextInt();
        
        
        ar.arrayIniti(arr,choice);
        ar.insertInto(arr,number,index,choice);
    }
}
