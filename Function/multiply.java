import java.util.*;

public class multiply {
    public static int calculateProduct(int a, int b) {
        
        return a * b;
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateProduct(a, b);
        System.out.println("Product of two number is :"+ sum);
    }
    
}
