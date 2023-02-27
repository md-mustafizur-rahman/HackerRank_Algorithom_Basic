import java.util.Scanner;

import static java.lang.Math.abs;

public class DigonalRefactor {
    public static void main(String[] args) {

       Scanner input=new Scanner(System.in);

       int n=input.nextInt();
       int arr[][]=new int[n][n];
       for (int i=0;i<n;i++){
           for (int j=0;j<n;j++){
       arr[i][j]=input.nextInt();
           }
       }
       int sumLeftTop=0;
       for (int i=0;i<n;i++){
           for (int j=i;j<i+1;j++){
               sumLeftTop=sumLeftTop+arr[i][j];
           }

       }

int sumRightTop=0;
       for (int i=0;i<n;i++){
           for (int j=n-1-i;j>n-2-i;j--){
               sumRightTop=sumRightTop+ arr[i][j];
           }

       }


       int result=abs(sumLeftTop-sumRightTop);
        System.out.println(result);

    }
}
