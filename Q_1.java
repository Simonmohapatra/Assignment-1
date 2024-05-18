public class Q_1 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a>2){
			System.out.println("The positive integer greater than 2 from command line argument is: "+a);
		}
		else {
			System.out.println("Invalid input. Please enter a number greater than 2");
		}
		int num=a,count=0;
		while (num>=2){
			num=num/2;
			count++;
		}
		System.out.println("THe number of  times one must repeatedly divide this number by 2 before getting a value less than 2 is "+count);
	}
}
