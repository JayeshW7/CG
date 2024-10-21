import java.util.Scanner;

public class Scannerr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String name = sc.nextLine();

        System.out.println("Enter Your Student ID:");
        String studentId = sc.nextLine();

        System.out.println(name);
        System.out.println(studentId);
        
        sc.close(); 
    }
}
