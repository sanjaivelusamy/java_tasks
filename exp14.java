import java.util.Scanner;

public class exp14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Number: ");
        int num = sc.nextInt();

        int ognum, rem, res = 0;
        ognum = num;

        while (ognum != 0){
            rem = ognum % 10;
            res += Math.pow(rem,3);
            ognum /= 10;
        }
        if (res == num){
            System.out.println(num+" Is An Armstrong Number.");
        }
        else{
            System.out.println(num+" Is Not An Armstrong Number.");
        }
    }
}
