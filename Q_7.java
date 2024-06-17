import java.util.Scanner;
public class Q_7{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements of array: ");
        int l= sc.nextInt();
        int arr[]=new int[l];
        System.out.println("Enter elements of the array: ");
        for (int i=0; i<l; i++){
            arr[i]= sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];

        int maxCount=1, maxPosition=0;
        for (int i=1; i<l; i++){
            if (arr[i]>max) {
                max=arr[i];
                maxPosition=i;
            }
            else if (arr[i]==max){
                maxCount++;
            }
        }

        System.out.println("Maximum element of array is "+max+" and occurs "+maxCount+" times.");
        System.out.println("First occurence of maximum element is at position "+maxPosition);

        int minCount=1, minPosition=0;
        for (int i=1; i<l; i++){
            if (arr[i]<min) {
                arr[i] = min;
            } else if (arr[i]==min) {
                minCount++;
                minPosition=i;
            }
        }
        System.out.println("Minimum element of array is "+min+" and occurs "+minCount+" times.");
        System.out.println("Last occurence of minimum element is at position "+minPosition);
    }
}
