import java.util.Scanner;

public class exp9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
        
        for (int i = 2; i <= a/2; i++) {
        
            if (a % i == 0) {
                System.out.println(a+ " Is NOt A Prime Number");
                break;
            } 
            else {
                System.out.println(a+ " Is A Prime Number");
                break;
            }
        }
    }
}
