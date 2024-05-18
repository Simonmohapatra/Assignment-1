import java.util.Scanner;
public class Q_6 {
    public static boolean isOdd(int i){
        return (i & 1)!=0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        System.out.println(N +" is odd: "+isOdd(N));
    }
}
