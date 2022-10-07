import java.util.Scanner;

public class FactoryTest {
    public static String products;

    public static void main(String[] args) {
        BananaFactory banana = new BananaFactory();
        AppleFactory apple = new AppleFactory();

        Scanner sc = new Scanner(System.in);

        System.out.println("Select a fruit");
        products = sc.nextLine();

        if (products.toLowerCase().contains("banana")) {
            banana.getFruit().getPrice();
        } else if (products.toLowerCase().contains("apple")) {
            apple.getFruit().getPrice();
        }
    }
}