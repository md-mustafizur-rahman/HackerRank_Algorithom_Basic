import java.util.Scanner;

public class FiveTOFor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long n[]=new long[5];
        for (int i=0;i<5;i++){
            n[i]=input.nextInt();
        }
        long min= Long.MAX_VALUE;
        long max= Long.MIN_VALUE;
        long value=0;
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if(n[i]==n[j]){
                    continue;
                }
                else {
                    value= value + n[j];

                }
            }
            if(value>max){
                max=value;

            }
            if(value<min){
                min=value;
            }
            value=0;
        }
        if(min==0&&max==0){
            for (int i=0;i<4;i++){
                min=min+n[i];
                max=max+n[i];
            }
        }

        System.out.println(min+" "+max);

    }
}
