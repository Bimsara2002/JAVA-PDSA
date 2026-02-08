import java.util.Scanner;

public class ArrayUpdate {
    public static void main(String[]args){

        int[] arr = new int[10];
        int size = 5;

        Scanner UserIn = new Scanner(System.in);
        
        System.out.println("Enter Input :");
        for(int j=0; j<size;j++){
            arr[j] = UserIn.nextInt();
        }
        System.out.println("Output is :");
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Enter the Index:");
        int ind = UserIn.nextInt();
        
        System.out.println("Enter the Element to Update:");
        int ele = UserIn.nextInt();

        arr[ind] = ele;

        System.out.println("Output is :");
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
            
        }
        
    }
}
