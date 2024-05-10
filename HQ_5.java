import java.util.Scanner;
public class HQ_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][]=new int[4][4];
        for (int i=0; i<4;i++){
            for (int j=0; j<4; j++){
                a[i][j]=(int)(Math.random()*2);
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        int maxRowIndex=-1, maxRowCount=-1;
        for (int i=0; i<4;i++){
            int count=0;
            for (int j=0; j<4; j++){
                if(a[i][j]==1){
                    count++;
                }
                if (count>maxRowCount){
                    maxRowCount=count;
                    maxRowIndex=i;
                }
            }
        }
        System.out.println("The largest row index: ");
        System.out.println(maxRowIndex);

        int maxColIndex=-1, maxColCount=-1;
        for (int i=0; i<4;i++){
            int count2=0;
            for (int j=0; j<4; j++){
                if(a[i][j]==1){
                    count2++;
                }
                if (count2>maxColCount){
                    maxColCount=count2;
                    maxColIndex=i;
                }
            }
        }
        System.out.println("The largest column index: ");
        System.out.println(maxColIndex);
    }
}
