import java.util.*;
public class PowerOfTwo {
    void check(int n) {
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        PowerOfTwo p = new PowerOfTwo();
        p.check(n);
    }
}
