import java.util.Scanner;
public class Q_5 {
    public static int sum_Of_Digits(int n){
        int num=n, sum=0;
        while (num>0){
            int lastdigit= num%10;
            sum+=lastdigit;
            num=num/10;
        }
        if (sum>=10){
            return sum_Of_Digits(sum);
        }else {
            return sum;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        System.out.println("Sum of digits of "+N+ " until the number is a single digit is "+sum_Of_Digits(N));
    }
}        
