public class MissingNumber {

    void find(int[] a, int n) {
        int s = 0;
        for (int i = 0; i < n; i++) 
        {
            s += a[i];
        }
        int t = 0;
        for (int i = 1; i <= n + 1; i++) 
        {
            t += i;
        }
        int m = t - s;
        System.out.println("Missing number is: " + m);
    }
    public static void main(String[] args) 
    {
        int[] a = {1, 2, 4, 5};
        int n = a.length;
        MissingNumber m = new MissingNumber();
        m.find(a, n);
    }
}
