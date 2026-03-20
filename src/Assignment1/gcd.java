package Assignment1;

public class gcd {
    public static void main(String[] args) {
        System.out.println(gcd(32,48));
        System.out.println(gcd(10,7));
    }

    public static int gcd(int a,int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
