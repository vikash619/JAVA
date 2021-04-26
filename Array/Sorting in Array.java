package first;
import java.util.Scanner;

class Sorting{
    Scanner bc = new Scanner(System.in);
    public void implementingArray(int arr[])
    {
        for(int i=0; i < arr.length; i++)
        {
            arr[i] = bc.nextInt();
        }
        
        System.out.println("Elements in array : ");
        for(int i=0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    
    public void sorti(int arr[])
    {
        System.out.println();
        System.out.println("Elements after sorting ascending to desceing order");
        for(int i=0; i < arr.length; i++)
        {
            for(int j=i+1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        
        for(int i=0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
public class Array2 {
    public static void main(String [] args)
    {
        Scanner bc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = bc.nextInt();
        
        int arr[] = new int[size];
        Sorting s = new Sorting();
        s.implementingArray(arr);
        s.sorti(arr);
        
    }
}
