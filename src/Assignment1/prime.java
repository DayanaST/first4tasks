package Assignment1;

public class prime {
    public static void main(String[] args) {
        int n=41;
        System.out.println("Is"+n+"prime?"+isprime(n,2));
    }
    public static boolean isprime(int n,int divisor){
        if(n<=1)return false;
        if(divisor*divisor==n)return false;
        if(n%divisor==0)return true;
        return isprime(n,divisor+1);
    }
}
