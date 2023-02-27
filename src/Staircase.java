import java.text.DecimalFormat;
import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=input.nextInt();

        }
        int positive=0,negative=0,zero=0;
        for (int i=0;i<n;i++){
            if(arr[i]>0){
                positive++;
            } else if (arr[i]<0) {
                negative++;

            }
            else {
                zero++;
            }
        }
        double positiveResult=(double) positive/(double) n;
        double negativeResult=(double) negative/(double) n;
        double zeroResult=(double) zero/(double) n;
        DecimalFormat numberFormat=new DecimalFormat("0.000000");
        System.out.println(numberFormat.format(positiveResult));
        System.out.println(numberFormat.format(negativeResult));
        System.out.println(numberFormat.format(zeroResult));
    }
}
