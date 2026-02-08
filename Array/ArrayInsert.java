import java.util.Scanner;

public class ArrayInsert {
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
        System.err.println("Enter The Index :");
        int ind = UserIn.nextInt();

        System.err.println("Enter The Element :");
        int ele = UserIn.nextInt();

        size++;

        for(int k=size; k>=ind;k--){
            arr[k] = arr[k-1];
        }
        arr[ind]=ele;

        System.out.println("Output is :");
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        
        }
        
    }
}
