public class Main {
    public static void main(String[] args) {

        checkNumber(2);
        checkNumber(-3);
        checkNumber(0);
    }

    private static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("the number is positive");
        } else if (number < 0) {
            System.out.println("the number is negative");
        } else {
            System.out.println("the number is 0 or non applicable");
        }
    }
}