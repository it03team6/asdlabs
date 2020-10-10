import java.util.Scanner;

public class RecursionLab {
    public static void main(String[] args) {
        int result = NumSum(GetNaturalInt());

        System.out.println(result);
    }


    /*private static int NumSumRec(int n)
    {
        if (n <= 9) return n;

        return (n%10)+NumSumRec(n/10);
    }*/

    private static int NumSum(int n)
    {
        int res = 0;
        int temp;
        while (n>9)
        {
            temp = n%10;
            res = temp + n/10;
            n = n/10;
        }

        return res;
    }


    private static int GetNaturalInt()
    {
        int s;
        do {
            Scanner natural = new Scanner(System.in);
            System.out.print("Natural number: ");
            s = natural.nextInt();
        } while (s <= 0);
        return s;
    }
}

