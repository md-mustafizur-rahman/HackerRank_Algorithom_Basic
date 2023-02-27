import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new  int[n];
        for (int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

        for (int i=0;i<n;i++){
            if(arr[i]>=38) {
                int temp = arr[i] % 5;
                temp = 5 - temp;

                if (temp < 3) {
                    arr[i] = arr[i] + temp;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
