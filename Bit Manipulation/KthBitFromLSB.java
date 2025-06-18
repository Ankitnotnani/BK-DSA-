import java.util.*;
public class KthBitFromLSB 
{
    void check(int n, int k) 
    {
        if (k <= 0) 
        {
            System.out.println("Invalid position from LSB");
            return;
        }
        if (((n >> (k - 1)) & 1) == 1) 
        {
            System.out.println("Set (from LSB)");
        } else 
        {
            System.out.println("Not set (from LSB)");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter bit position (k): ");
        int k = sc.nextInt();
        KthBitFromLSB l = new KthBitFromLSB();
        l.check(n, k);
    }
}
