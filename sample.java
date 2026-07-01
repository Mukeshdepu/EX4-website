import java.util.Scanner;

public class SampleProgram {

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        greet(name);
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        System.out.println("\nNumbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
