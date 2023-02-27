import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String value=input.next();
        if (value.charAt(value.length()-2)=='P'&&value.charAt(0)=='1'&&value.charAt(1)=='2') {
            String Result="12"+value.substring(2,8);
            System.out.println(Result);

        }
        else if (value.charAt(value.length()-2)=='A'&&value.charAt(0)=='1'&&value.charAt(1)=='2') {
            String Result="00"+value.substring(2,8);
            System.out.println(Result);

        }
        else if(value.charAt(value.length()-2)=='P'){
            int  carry= Integer.parseInt( value.substring(0,2));
            carry=carry+12;

            String Result=carry+value.substring(2,8);
            System.out.println(Result);

        }


        else {
            String Result=value.substring(0,8);
            System.out.println(Result);
        }
    }
}
