import java.util.Scanner;

public class ATM {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static void main() {
        Scanner Atm = new Scanner(System.in);
            System.out.println(GREEN+"=====LOGIN====="+RESET);
            int n = 2;
            while (true) {
                System.out.print("Enter PIN: ");
                int pin = Atm.nextInt();
                if (pin == 2009) {
                    System.out.println(GREEN+"Login successful!"+RESET);
                    System.out.println("");
                    break;
                } else {
                    System.out.println(RED+"Incorrect PIN"+RESET);
                    System.out.println("Attempts left: " +RED+ n+RESET);
                    if (n == 0) {
                        System.out.print("Your account has been blocked.");
                        break;
                    }
                    n--;


                }
            }
            int balance = 1000;
            while (true) {
                System.out.println(GREEN+"=======ATM MENU======="+RESET);
                System.out.println(GREEN+"1."+RESET+ " Check balance"+GREEN+ "    ||"+RESET);
                System.out.println(GREEN+"2."+RESET+ " Deposit money"+GREEN+ "    ||"+RESET);
                System.out.println(GREEN+"3."+RESET+ " Withdraw money"+GREEN+ "   ||"+RESET);
                System.out.println(GREEN+"4."+RESET+ " Exit"+GREEN+ "             ||"+RESET);
                System.out.println(GREEN+"======================"+RESET);
                System.out.print(GREEN+"#"+RESET+"  Choose an option: "+RESET);
                int option = Atm.nextInt();
                System.out.println("");
                if (option == 1) {
                    System.out.println(GREEN+"=====1. CHECK BALANCE====="+RESET);
                    System.out.println("Your balance:"+GREEN+ " $" +balance+RESET);
                    System.out.println("");
                } else if (option == 2) {
                    System.out.println(GREEN+"=====2. DEPOSIT MONEY====="+RESET);
                    while (true) {
                        System.out.print("Enter the deposit amount: ");
                        double deposit = Atm.nextDouble();
                        if (deposit >= 0) {
                            System.out.println("Your balance: $" + (balance + deposit));
                            System.out.println("Back to ATM MENU...");
                            System.out.println("");
                            balance += deposit;
                            break;
                        } else {
                            System.out.println("You can't enter negative amount");
                        }
                    }
                } else if (option == 3) {
                    System.out.println(GREEN+"=====3. WITHDRAW MONEY====="+RESET);
                    while (true) {
                        System.out.print("Enter the withdrawal amount: ");
                        double withdraw = Atm.nextDouble();
                        if (withdraw >= 0) {
                            if (withdraw < balance) {
                                System.out.println("Your balance: $" + (balance - withdraw));
                                System.out.println("Back to ATM MENU...");
                                System.out.println("");
                                balance -= withdraw;
                                break;
                            } else {
                                System.out.println("You have not enough money");
                            }
                        } else {
                            System.out.println("You can't enter negative amount");
                        }
                    }
                } else if (option == 4) {
                    System.out.println(GREEN+"=====THANK YOU FOR CHOOSING US=====");
                    break;
                }
                else {
                    System.out.println("You have only 4 options!!!");
                }





            }

    }
}
