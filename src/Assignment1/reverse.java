package Assignment1;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        reversePrint(n,sc);
    }

    public static void reversePrint(int n,Scanner sc){
        if(n<=0)
            return;
        int current=sc.nextInt();
        reversePrint(n-1,sc);
        System.out.print(current+" ");
    }
}
