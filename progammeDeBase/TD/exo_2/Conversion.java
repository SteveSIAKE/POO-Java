package TD.exo_2;

public class Conversion {
    public static void main(String arg[]) {
        String a = "10";
        String b = "20.5";
        try {
            int c = Integer.parseInt(a);
            System.out.println("La conversion est : " + c);
        } catch (NumberFormatException e) {
            System.out.println("La conversion est impossible");
        }
        try {
            double d = Double.parseDouble(b);
            System.out.println("la conversion est : " + d);
        } catch (NumberFormatException e) {
            System.out.println("La conversion est impossible");
        }
    }
}
