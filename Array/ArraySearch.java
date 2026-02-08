import java.util.Scanner;

public class ArraySearch {
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
        System.out.println("Enter The Element To Search :");
        int ele = UserIn.nextInt();

        int k;
        for(k=0; k<size;k++){
            if(arr[k]==ele)
            break;
        }
        System.out.println("Index is :" +k);
    }
}
