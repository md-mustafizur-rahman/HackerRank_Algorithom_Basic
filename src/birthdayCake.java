import java.util.*;

public class birthdayCake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
       Integer arr[]=new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i]=input.nextInt();
        }

       Arrays.sort(arr,Collections.reverseOrder());

        int count = 0;


        for (int i = 0; i < n-1; i++) {
            if (arr[i].equals(arr[i+1])) {
                count++;
            }
            else {
                break;
            }

        }
        count = count + 1;
        System.out.println(count);





    }
}
