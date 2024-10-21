import java.io.Console;

public class Con2 {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("Enter Password:");
        char[] ch = console.readPassword();

        System.out.println("Now your password is:");
        for (char ch1 : ch) {
            System.out.print(ch1);
        }
    }
}
