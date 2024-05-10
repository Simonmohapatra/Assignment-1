import java.util.Scanner;
public class HQ_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arrays: ");
        int n=sc.nextInt();
        int a[]= new int[n];
        int b[]=new int [n];
        int c[]=new int [n];
        System.out.println("Enter elements of a: ");
        for (int i=0; i<n; i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Enter elements of b: ");
        for (int i=0; i<n; i++){
            b[i]= sc.nextInt();
        }
        System.out.print("Elements of array c are: ");
        for (int i=0; i<n; i++){
            c[i]=a[i]*b[i];
            System.out.print(c[i]+" ");
        }
    }
}
