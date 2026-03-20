package Assignment1;

public class fibonacci {
    public static void main(String[] args) {
        int n=5;
        int result=fibonacci(n);
        System.out.println("f("+n+")="+result);

        int n2=17;
        System.out.println("f("+n2+")="+1597);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
