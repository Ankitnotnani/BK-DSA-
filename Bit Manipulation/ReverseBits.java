import java.util.*;

public class ReverseBits {
    int reverse(int n, int size) {
        int r = 0;
        for (int i = 0; i < size; i++) {
            r = (r << 1) | (n & 1);
            n = n >> 1;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = sc.nextInt();
        ReverseBits obj = new ReverseBits();  
        int r = obj.reverse(n, size);         
        System.out.println(r);
        sc.close();
    }
}
