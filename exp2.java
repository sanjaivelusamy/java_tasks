import java.util.Scanner;

public class exp2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Enter 1st No.");
        int a = sc.nextInt();

        System.out.println("Enter 2nd No.");
        int b = sc.nextInt();

        System.out.println("Enter 3rd NO.");
        int c = sc.nextInt();

        if (a > b){
            if(a > c){
                System.out.println(a+" Is Greater");
            }
            else {
                System.out.println(b+" Is Greater");
            }
        }
        else{
            System.out.println(c+ " Is Greater");
        }*/
        int temp = 0;

        for (int i = 0; i < 3; i++) {
            int z = sc.nextInt();
            if (temp < z){
                temp = z;
            }
        }
        System.out.println(temp);
    }
}