import java.util.Scanner;

public class StoreCheckout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Accumulators and counters for the checkout session
        double subtotal = 0.0;
        int totalItemsPurchased = 0;

        //Main program loop for shopping
        while (true) {
            //Display the Store Menu
            System.out.println("===== SIMPLE STORE =====");
            System.out.println("1. Mouse - $20");
            System.out.println("2. Keyboard - $40");
            System.out.println("3. Headphones - $50");
            System.out.println("4. Laptop Stand - $30");
            System.out.println("5. Checkout");
            System.out.print("Choose a product: ");

            int choice = input.nextInt();

            //Exit the loop if the customer chooses Checkout
            if (choice == 5) {
                break;
            }

            //Validate the Product Choice
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid option.");
                System.out.println("Please choose a number from 1 to 5.");
                System.out.println(); // Blank line for better readability
                continue;
            }

            //Assign name and price based on product selection
            String productName = "";
            double productPrice = 0.0;

            if (choice == 1) {
                productName = "Mouse";
                productPrice = 20.0;
            } else if (choice == 2) {
                productName = "Keyboard";
                productPrice = 40.0;
            } else if (choice == 3) {
                productName = "Headphones";
                productPrice = 50.0;
            } else if (choice == 4) {
                productName = "Laptop Stand";
                productPrice = 30.0;
            }

            //Selecting a Product and requesting quantity
            System.out.println("You selected: " + productName);
            System.out.println("Price: $" + (int)productPrice);
            System.out.print("Enter quantity: ");

            int quantity = input.nextInt();

            //Validate the Quantity
            if (quantity <= 0) {
                System.out.println("Invalid quantity.");
                System.out.println("Quantity must be greater than 0.");
                System.out.println();
                continue;
            }

            //Calculate item cost and update running totals
            double itemCost = productPrice * quantity;
            subtotal += itemCost;
            totalItemsPurchased += quantity;

            //Display cart addition details
            System.out.println((int)quantity + " x $" + (int)productPrice + " = $" + (int)itemCost);
            System.out.println("Added to cart!");
            System.out.println("Current total: $" + (int)subtotal);
            System.out.println();
        }

        //Checkout phase
        System.out.println("===== CHECKOUT =====");
        System.out.println("Subtotal: $" + (int)subtotal);

        //Discount calculation (10% discount for orders $100 or more)
        double discount = 0.0;
        if (subtotal >= 100) {
            discount = subtotal * 0.10;
        }
        double finalTotal = subtotal - discount;

        System.out.println("Discount: $" + (int)discount);
        System.out.println("Final total: $" + (int)finalTotal);

        //Payment processing and validation loop
        double paymentAmount = 0.0;
        while (true) {
            System.out.print("Enter payment amount: $");
            paymentAmount = input.nextDouble();

            if (paymentAmount >= finalTotal) {
                System.out.println("Payment successful!");
                break;
            } else {
                double remaining = finalTotal - paymentAmount;
                System.out.println("Insufficient payment.");
                System.out.println("You still need to pay: $" + (int)remaining);
            }
        }

        //Calculate change
        double change = paymentAmount - finalTotal;
        System.out.println("Change: $" + (int)change);

        //Final Receipt display
        System.out.println("========================");
        System.out.println(" SIMPLE STORE");
        System.out.println("========================");
        System.out.println("Items purchased: " + totalItemsPurchased);
        System.out.println("Subtotal: $" + (int)subtotal);
        System.out.println("Discount: $" + (int)discount);
        System.out.println("Final total: $" + (int)finalTotal);
        System.out.println("Payment: $" + (int)paymentAmount);
        System.out.println("Change: $" + (int)change);
        System.out.println("========================");
        System.out.println("Thank you for shopping!");
        System.out.println("========================");

    }
}


