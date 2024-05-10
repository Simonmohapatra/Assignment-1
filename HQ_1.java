import java.util.Scanner;
public class HQ_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a+b==c && a==b-c && a*b==c){
            System.out.println("The numbers can be used in a correct arithmetic formula ");
        }
        else {
            System.out.println("The numbers cannot be used in a correct arithmetic formula ");
        }
    }
}
