package Assignment1;

public class count {
    public static void main(String args[]) {
        System.out.println(countChars("hello"));
        System.out.println(countChars("recursion"));
    }

    public static int countChars(String s) {
        if (s.isEmpty()){
            return 0;
        }
        return 1+countChars(s.substring(1));
    }
}
