import java.io.BufferedReader;
import java.io.InputStreamReader;

public class buffer {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader stringBuffer = new BufferedReader(inputStreamReader);

        System.out.println("Enter your name:\t");
        String name = stringBuffer.readLine();

        System.out.println("Your Name is: " + name);
    }
}
