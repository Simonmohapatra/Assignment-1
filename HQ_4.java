import java.util.Scanner;
public class HQ_4 {
    public static double[][] addMatrix(double[][]a, double[][]b){
        int row=a.length;
        int column=a[0].length;
        double [][]sum= new double[row][column];
        for (int i=0; i<row;i++){
            for (int j=0;j<column;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of row and column: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        double [][]a= new double[r][c];
        double [][]b= new double[r][c];
        System.out.println("Enter elements of a:");
        for (int i=0; i<r;i++){
            for (int j=0; j<c; j++){
                a[i][j]=sc.nextDouble();
            }
        }
        System.out.println("Enter elements of b:");
        for (int i=0; i<r;i++){
            for (int j=0; j<c; j++){
                b[i][j]=sc.nextDouble();
            }
        }
        System.out.println("Sum of a and b ");
        double sum[][]=addMatrix(a,b);
        for (int i=0; i<r;i++){
            for (int j=0; j<c; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
    
