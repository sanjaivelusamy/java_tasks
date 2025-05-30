import java.util.Scanner;
public class exp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Year: ");
        int year = sc.nextInt();

        if (year % 4 == 0 ) {
            if (year == 2100){
                System.out.println(year+" Is Not A Leap Year");
            }
            else if (year == 2400){
                System.out.println(year+" Is Not A Leap Year");
            }
            else{
                System.out.println(year+" Is A Leap Year");
            }
        }
        else {
            System.out.println(year+" Is Not A Leap Year");
        }
    }
}
