import java.util.Scanner;
public class exp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Number");
        int a = sc.nextInt();
        int b = 0;

        // for (int i = 1; i <= a; i++){
        //     b += i;
        // }

        // System.out.println(b);

        System.out.println("Sum = "+(a*(a+1))/2);
    }
}
