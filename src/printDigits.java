public class printDigits {
    public static void main(String[] args){
        printDigits(5481);
    }

    public static void printDigits(int num) {
        if (num<10) {
            System.out.println(num);
            return;
        }

        printDigits(num/10);
        System.out.println(num%10);
    }

}



