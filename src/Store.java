import java.util.Scanner;

public class Store {
    static float fTotal = 0;

    public static void main(String[] args) {
        /* Create scanner */
        Scanner scanner = new Scanner(System.in);

        /* Receipt variable */
        String receipt = "";

        int menuOption;

        do {
            /* Menu option */
            System.out.printf("menu:\n1. Sale \n2. Print Receipt \n3. Exit\n");
            menuOption = scanner.nextInt();

            /* Perform Option */
            receipt = performOption(scanner, menuOption, receipt);
            //System.out.println(receipt);
        } while (menuOption != 3);

    }

    public static String performOption(Scanner scanner, int menuOption, String receipt) {
        switch (menuOption) {
            case 1:
                /* Sale */
                String newLine = performSale(scanner);
                receipt = receipt.concat(newLine);
                System.out.println("in case 1: " +receipt);
                /* Append to receipt */
                break;
            case 2:
                /* Print Receipt */
                System.out.println("Here is your receipt for today \n");
                System.out.println(receipt);
                System.out.print("Total for your purchases: ");
                System.out.printf("%18.2f\n",fTotal);
                // printTotal();
                break;
            case 3: System.exit(0);
                /* Wrong user input */
        }
    return receipt;
    }

    public static String performSale(Scanner scanner) {
        float finalTotal = 0;
        System.out.println("What item do you want to buy?");
        String item = scanner.next();
        System.out.println("What's the price of the item?");
        float price = scanner.nextFloat();
        System.out.printf("How many %s would you like?", item);
        int quantity = scanner.nextInt();
        float total = calculateTotal(price, quantity);
        // Adding total to endPrice
        fTotal = fTotal + total;
        System.out.println("final total: " + fTotal);
        //addToEndPrice(total);

        return String.format("%8s\t%8.2f\t%8d\t%8.2f\n", item, price, quantity, total);
    }

    public static float calculateTotal(float price, int quantity) {
        return price * quantity;
    }

    public static float addToEndPrice(float totalEndPrice) {
        float floatNber = +totalEndPrice;
        System.out.println(floatNber);
        return floatNber;
    }

}