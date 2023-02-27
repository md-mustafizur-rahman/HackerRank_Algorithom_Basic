import java.util.Scanner;

public class CompareTripels {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a[]=new int[3];
        int b[]=new int[3];

        for (int i=0;i<3;i++){
            a[i]=input.nextInt();
        }
        for (int i=0;i<3;i++){
            b[i]=input.nextInt();
        }

        int alice=0,bob=0;
        for (int i=0;i<3;i++){
            if (a[i]>b[i]){
                alice++;
            } else if (a[i]<b[i]) {

                bob++;
            }

        }
        System.out.println(alice+" "+bob);
    }
}
