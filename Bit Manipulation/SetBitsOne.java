import java.util.*;
public class SetBitsOne 
{
    void count(int n) 
    {
        int c = 0;
        while (n > 0) 
        {
            if ((n & 1) == 1) 
            {
                c++;
            }
            n = n >> 1;
        }
        System.out.println("Set bits: " + c);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        SetBitsOne s = new SetBitsOne();
        s.count(n);
    }
}
