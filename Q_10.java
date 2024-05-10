import java.util.Scanner;
public class Q_10{
    public static double sumColumn(double [][]m, int columnIndex){
        double sum=0;
        for (int i=0; i<m.length; i++){
            sum+=m[i][columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double arr[][]=new double[3][4];
        System.out.println("Enter a 3 by 4 matrix row by row: ");
        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                arr[i][j]= sc.nextDouble();
            }
        }
        for (int j=0; j<4; j++){
            System.out.println("Sum of elements at column "+j+" is "+sumColumn(arr,j));
        }
    }
}
