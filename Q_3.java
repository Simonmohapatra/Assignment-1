public class Q_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int n= num, sum=0, product=1;
        while (n>0){
            int lastDigit= n%10;
            sum+=lastDigit;
            product*=lastDigit;
            n=n/10;
        }
        System.out.println("Sum of digit of N = "+sum);
        System.out.println("Product of digit of N = "+product);
        if (sum==product){
            System.out.println(num+" is a spy number.");
        }
        else {
            System.out.println(num+" is not a spy number.");
        }
    }
}
