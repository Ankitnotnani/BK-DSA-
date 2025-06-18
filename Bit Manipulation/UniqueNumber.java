public class UniqueNumber 
{
    void find(int[] a, int n)
    {
        int x = 0;
        for (int i = 0; i < n; i++) 
        {
            x ^= a[i];
        }
        System.out.println("Unique number is: " + x);
    }
    public static void main(String[] args) 
    {
        int[] a = {1, 2, 3, 2, 1, 4, 3};
        int n = a.length;
        UniqueNumber u = new UniqueNumber();
        u.find(a, n);
    }
}
