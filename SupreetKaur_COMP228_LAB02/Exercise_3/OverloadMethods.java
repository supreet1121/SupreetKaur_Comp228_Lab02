public class OverloadMethods {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    //Main
    public static void main(String[] args) {
        int sumTwo = sum(5, 10);
        int sumThree = sum(1, 2, 3);
        int sumFour = sum(4, 5, 6, 7);
        System.out.println("Sum of 5 and 10: " + sumTwo);
        System.out.println("Sum of 1, 2, and 3: " + sumThree);
        System.out.println("Sum of 4, 5, 6, and 7: " + sumFour);
    }
}
