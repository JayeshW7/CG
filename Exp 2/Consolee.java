import java.io.Console;
public class Consolee {
    public static void main(String[] args) 
    { 
        Console console = System.console(); 
        System.out.println("Enter Your Name:"); 
        String name = console.readLine();
        System.out.println("Welcome " +name+" to java world");
    }
}
