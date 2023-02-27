import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
       long[] b =new long[a];
      for (int i=0;i<a;i++){
          b[i]=input.nextInt();


      }
        long sum=0;
        for (int i = 0; i<a; i++){
       sum=sum+b[i];
      }

        System.out.println(sum);
    }
}
