import java.util.Scanner;

class ShoppingCart
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        double total;

        System.out.println("Enter Item Name:");
        item = scanner.nextLine();

        System.out.println("Enter Price:");
        price = scanner.nextDouble();

        System.out.println("Enter Quantity:");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("Item : " + item);
        System.out.println("Total Price: " + total);

        scanner.close();
    }
}
