package Variables;

public class Variables_Java {
    public static void main(String[] arg) {
        // Variables
        String name = "Hanzala";
        int age = 19;
        double price = 19.19;
        int a = 10;
        int b = 20;

        int sum = a + b;

        System.out.println(sum);
        System.out.println(name);

        // we can change variables after assigning
        name = "Hanzala Ahmed";
        price = 20.20;
        a = 11;
        b = 21;

        int sum2 = a + b;

        System.out.println(sum2);
        System.out.println(name);
    }
}
