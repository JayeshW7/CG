public class arrayss {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        numbers[2] = 100; // Change the third element to 100
        System.out.println("Modified third element: " + numbers[2]);

        System.out.println("Iterating over the array:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Array length: " + numbers.length);
    }
}
