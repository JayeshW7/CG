class ConstructorCreator { 
    String name;

    public ConstructorCreator() {
        System.out.println("This is Default Constructor!");
    }

    public ConstructorCreator(String name) { 
        System.out.println("This is Parameterized Constructor!!"); 
        this.name = name;
    }
}

public class StudentClass {
    public static void main(String[] args) {
        ConstructorCreator constructorCreator = new ConstructorCreator(); 
        System.out.println("Student Name: " + constructorCreator.name); 
        System.out.println("");

        ConstructorCreator constructorCreator1 = new ConstructorCreator("Jayesh Wagh");
        System.out.println("Student Name: " + constructorCreator1.name);
    }
}
