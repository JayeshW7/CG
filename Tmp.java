class Tmp
{
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        System.out.println("Arrat Elements:");
        for(int i=0; i<=a.length; i++)
        {
            System.out.println(a[i] + " ");
        }
        System.out.println();

        System.out.println("Last element: " + a[a.length - 1]);
    }
}