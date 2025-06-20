import java.util.*;
public class GCD {
    int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        GCD obj = new GCD();
        int gcd = obj.findGCD(a, b);
        System.out.println("GCD = " + gcd);
        sc.close();
    }
}
