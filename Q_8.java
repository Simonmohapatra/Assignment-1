import java.util.Scanner;
public class assignment_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Row and Columns of 2D-Array: ");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter elements of 2D-Array: ");
        for (int i=0; i<r; i++){
            for (int j=0; j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int sum=0;
        System.out.println("The elements of 2D-Array are: ");
        for (int i=0; i<r; i++){
            for (int j=0; j<c;j++){
                System.out.print(arr[i][j]+" ");
                sum+=arr[i][j];
            }
            System.out.println();
        }
        System.out.println("The sum of elements of the 2D-Array is "+sum);
    }
}
