using System;

public class Program {
    public static void Main() {
        string[] input = Console.ReadLine().Split(" ");
        int s = Convert.ToInt32(input[0]);
        int t = Convert.ToInt32(input[1]);
        int n = Convert.ToInt32(input[2]);

        //read more lines
        string[] d_str = Console.ReadLine().Split(" ");
        string[] b_str = Console.ReadLine().Split(" ");
        string[] c_str = Console.ReadLine().Split(" ");

        int[] d = new int[n + 1];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = Convert.ToInt32(d_str[i]);
            b[i] = Convert.ToInt32(b_str[i]);
            c[i] = Convert.ToInt32(c_str[i]);
        }
        d[n] = Convert.ToInt32(d_str[n]);

        int ans = s;
        for (int i = 0; i < n; i++) {
            ans += d[i];
            while (ans % c[i] != 0) {
                ans++;
            }
        }
        ans += d[n];

        if (ans <= t) {
            Console.WriteLine("yes");
        } else {
            Console.WriteLine("no");
        }
    }
}
