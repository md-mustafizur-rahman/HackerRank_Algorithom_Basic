import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int an[]=new int[a];
        for (int i=0;i<a;i++)
        {
            an[i]=input.nextInt();
        }

        int sum=0;
        for (int i=0;i<a;i++)
        {
            sum=sum+an[i];
        }
        System.out.println(sum);



    }
}
