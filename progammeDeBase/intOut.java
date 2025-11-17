import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String name = input.nextLine();

        System.out.print("Entrez votre âge : ");
        int age = input.nextInt();

        System.out.print("Entrez votre taille : ");
        double height = input.nextDouble();

        System.out.println("Bonjour " + name);
        System.out.println("Âge : " + age);
        System.out.println("Taille : " + height);
    }
}
