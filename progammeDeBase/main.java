public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double division(double x, double y) {
        if (y == 0) {
            System.out.println("Impossible de diviser par zéro");
            return 0;  
        } else {
            return x / y;
        }
    }

    public static boolean isEven(int n){
        return n % 2 == 0;
    }


    public static String checkNumber(int n) {
    return (n > 0) ? "positive" : (n < 0) ? "negative" : "zero";
    }


    public static void main(String[] args) {

        double divide1 = division(100, 5);
        double divide2 = division(100, 0);

        double multiplication = multiply(5151, 61);
        int addition = add(31, 15);

        System.out.println("The result is : " + addition);
        System.out.println("The multiplication is : " + multiplication);

        System.out.println("Division 1 : " + divide1);
        System.out.println("Division 2 : " + divide2);
    }
}
