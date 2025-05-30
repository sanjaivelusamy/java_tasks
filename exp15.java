import java.util.Scanner;

public class exp15 {

    static int gcd(int a, int b){
        if (b == 0)
            return a;

        else
            return gcd(b, a % b);
    }

    static int lcm(int a, int b, int gcdvalue){
        return Math.abs(a*b)/gcdvalue;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter A Number: ");
        int a = sc.nextInt();

        System.out.println("Enter B Number: ");
        int b = sc.nextInt();
         
        int gcdvalue;

        gcdvalue = gcd(a,b);

        System.out.println("GCD = "+gcdvalue);

        System.out.println("LCM = "+gcdvalue);
    }
}
