using System;

public class Program {
    public static void Main() {
        int L = Convert.ToInt32(Console.ReadLine());
        int D = Convert.ToInt32(Console.ReadLine());
        int X = Convert.ToInt32(Console.ReadLine());

        int N = 0, M = 0;

        for (int i = D; i >= L; i--) {
            N = (SumDigits(i) == X) ? i : N;
        }

        for (int i = L; i <= D; i++) {
            M = (SumDigits(i) == X) ? i : M;
        }

        Console.WriteLine(N + "\n" + M);
    }

    public static int SumDigits(int num) {
        int sum = 0;
        
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
