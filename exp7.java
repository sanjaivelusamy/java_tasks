import java.util.Scanner;

public class exp7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Positive Number ");
        int num = sc.nextInt();
        int rev;

        rev = num % 10;
        num = num / 10;
        System.out.println(num + (rev * 10));

    }    
}
