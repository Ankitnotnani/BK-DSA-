import java.util.*;
public class SetBitsRange 
{
    void count(int n) 
    {
        int c = 0;
        for (int i = 1; i <= n; i++) 
        {
            int x = i;
            while (x > 0) {
                if ((x & 1) == 1) 
                {
                    c++;
                }
                x = x >> 1;
            }
        }
        System.out.println("Total set bits from 1 to " + n + ": " + c);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        SetBitsRange s = new SetBitsRange();
        s.count(n);
    }
}
