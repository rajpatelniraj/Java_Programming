import java.util.*;

public class sum {
    public static int calculationSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculationSum(a, b);
        System.out.println("Sum of two number is :"+ sum);
    }
}   
