using System;

public class Program {
    public static void Main() {
        string[] input = Console.ReadLine().Split(" ");
        int A = Convert.ToInt32(input[0]);
        int I = Convert.ToInt32(input[1]);

        Console.WriteLine(Math.Ceiling((double)A * (double)(I - 1) + 1));
    }
}
