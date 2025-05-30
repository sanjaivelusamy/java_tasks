import java.util.Scanner;

public class exp13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num+" Is A Positive Number.");
        }
        else if (num < 0){
            System.out.println(num+" Is A Negative Number.");
        }
        else{
            System.out.println(num+" Is Zero.");
        }
    }
}
