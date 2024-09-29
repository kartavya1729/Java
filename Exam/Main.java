import java.util.Scanner;

class Bill {
    protected int price;
    protected int quantity;

    public int calculateBill(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
        return price * quantity;
    }
}

class Cash extends Bill {
    private int notes2000;
    private int notes500;
    private int notes100;
    private int notes50;
    private int notes10;

    public int calculateCash(int notes2000, int notes500, int notes100, int notes50, int notes10) {
        this.notes2000 = notes2000;
        this.notes500 = notes500;
        this.notes100 = notes100;
        this.notes50 = notes50;
        this.notes10 = notes10;
        return (notes2000 * 2000) + (notes500 * 500) + (notes100 * 100) + (notes50 * 50) + (notes10 * 10);
    }

    public void checkBalance(int billAmount, int cashAmount) 
    {
        if (cashAmount >= billAmount) 
        {
            System.out.println("Clear");
        } 
        else 
        {
            int balance = billAmount - cashAmount;
            System.out.println("Need to pay: " + balance);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of item: ");
        int price = scanner.nextInt();

        System.out.print("Enter the quantity of the item: ");
        int quantity = scanner.nextInt();

        Cash cash = new Cash();

        int billAmount = cash.calculateBill(price, quantity);

        System.out.print("Enter the number of Rs 2000 notes: ");
        int notes2000 = scanner.nextInt();

        System.out.print("Enter the number of Rs 500 notes: ");
        int notes500 = scanner.nextInt();

        System.out.print("Enter the number of Rs 100 notes: ");
        int notes100 = scanner.nextInt();

        System.out.print("Enter the number of Rs 50 notes: ");
        int notes50 = scanner.nextInt();

        System.out.print("Enter the number of Rs 10 notes: ");
        int notes10 = scanner.nextInt();

        int cashAmount = cash.calculateCash(notes2000, notes500, notes100, notes50, notes10);

        cash.checkBalance(billAmount, cashAmount);

        scanner.close();
    }
}
