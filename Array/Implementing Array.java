package first;
import java.util.Scanner;

class ArrayImpl{
    Scanner sc = new Scanner(System.in);
    
    public void implementArray(int arr[],int len)
    {
        for(int i = 0; i < len; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < len; i++)
        {
            System.out.println(arr[i]);
        }
    }
}

public class Array1 {
    public static void main(String [] args)
    {
        int arr[] = new int[5];
        int len = arr.length;
        ArrayImpl a = new ArrayImpl();
        a.implementArray(arr, len);
    }
}
