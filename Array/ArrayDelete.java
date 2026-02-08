import java.util.Scanner;

public class ArrayDelete {
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
        System.out.println("Enter The Index :");
        int ind = UserIn.nextInt();

        for(int k=ind; k<size;k++){
            arr[k] = arr[k+1];
        }
        size--;

        System.out.println("Output is :");
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        
        }
        
    }
}
