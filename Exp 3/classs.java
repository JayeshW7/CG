class Dog
{
    String name;
    void bark()
    {
        System.out.println(name + " says Woof!");;
    }
}
public class classs
{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Icy";
        dog.bark();
    }
}