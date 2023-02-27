import java.util.Scanner;

public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        int t=input.nextInt();
        int apple=input.nextInt();
        int orange=input.nextInt();
        int AppleLimit=input.nextInt();
        int OrangeLimit=input.nextInt();
        int AppleArr[]=new int[AppleLimit];
        int OrangeArr[]=new int[OrangeLimit];
        for (int i=0;i<AppleLimit;i++){
            AppleArr[i]=input.nextInt();
        }
        for (int i=0;i<OrangeLimit;i++){
            OrangeArr[i]=input.nextInt();
        }

        int FinalAppleArr[]=new int[AppleLimit];
        int FinalOrangeArr[]=new int[OrangeLimit];

        for (int i=0;i<AppleLimit;i++){
            FinalAppleArr[i]=apple+AppleArr[i];
        }
        for (int i=0;i<OrangeLimit;i++){
            FinalOrangeArr[i]=orange+OrangeArr[i];
        }

        int AppleCount=0,OrangeCount=0;
        for (int i=0;i<AppleLimit;i++){
            if(FinalAppleArr[i]>=s&&FinalAppleArr[i]<=t){
//                System.out.println(FinalAppleArr[i]);
                AppleCount++;
            }
        }

        for (int i=0;i<OrangeLimit;i++){
            if(FinalOrangeArr[i]>=s&&FinalOrangeArr[i]<=t){
                OrangeCount++;
            }
        }

        System.out.println(AppleCount);
        System.out.println(OrangeCount);





    }
}
