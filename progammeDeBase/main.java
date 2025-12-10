// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Main {
    public static void main(String[] var0) {
        Shape[] tab = new Shape[3];
        tab[0] = new Rectangle(2.0, 4.0);
        tab[1] = new Circle(4);
        tab[2] = new Square(4);

        double totalArea = 0.0;

        for (int i = 0; i < tab.length; i++) {
            System.out.println("je mache bien");
            System.out.println(totalArea += tab[i].area());
        }
    }

    /**
     * public static int add(int var0, int var1) {
     * return var0 + var1;
     * }
     * 
     * public static double multiply(double var0, double var2) {
     * return var0 * var2;
     * }
     * 
     * public static double division(double var0, double var2) {
     * if (var2 == 0.0) {
     * System.out.println("Impossible de diviser par zéro");
     * return 0.0;
     * } else {
     * return var0 / var2;
     * }
     * }
     * 
     * public static boolean isEven(int var0) {
     * return var0 % 2 == 0;
     * }
     * 
     * public static String checkNumber(int var0) {
     * return var0 > 0 ? "positive" : (var0 < 0 ? "negative" : "zero");
     * }
     * 
     * public static void main(String[] var0) {
     * double var1 = division(100.0, 5.0);
     * double var3 = division(100.0, 0.0);
     * double var5 = multiply(5151.0, 61.0);
     * int var7 = add(31, 15);
     * System.out.println("The result is : " + var7);
     * System.out.println("The multiplication is : " + var5);
     * System.out.println("Division 1 : " + var1);
     * System.out.println("Division 2 : " + var3);
     * }
     */
}
