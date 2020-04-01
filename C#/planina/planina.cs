using System;

public class Program {
    public static void Main() {
        int N = Convert.ToInt32(Console.ReadLine());
        int P = 2;
        for (int i = 0; i < N; i++) {
            P = P * 2 - 1;
        }
        Console.WriteLine(P * P);
    }
}
