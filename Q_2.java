public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter person's weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height of person in meter: ");
        double height= sc.nextDouble();
        double bmi= weight/(height*height);
        if (bmi<18.5){
            System.out.println("The person is Underweight.");
        }
        else if (bmi>=18.5 && bmi<=24.9) {
            System.out.println("The person has Normal weight.");
        }
        else if (bmi>=25.0 && bmi<=29.9) {
            System.out.println("The person is Overweight.");
        }
        else {
            System.out.println("The person is Obese.");
        }
    }
}
