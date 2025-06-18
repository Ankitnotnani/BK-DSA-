import java.util.*;
public class KthBitFromMSB 
{
    void check(int n, int k) 
    {
        int size = 0;
        int x = n;
        while (x > 0) 
        {
            size++;
            x = x >> 1;
        }
        int pos = size - k;
        if (pos < 0) 
        {
            System.out.println("Invalid position from MSB");
            return;
        }
        if (((n >> pos) & 1) == 1) 
        {
            System.out.println("Set (from MSB)");
        } else {
            System.out.println("Not set (from MSB)");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter bit position (k): ");
        int k = sc.nextInt();
        KthBitFromMSB m = new KthBitFromMSB();
        m.check(n, k);
    }
}
