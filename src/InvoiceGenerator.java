import java.util.Scanner;

public class InvoiceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BILL TO INFORMATION ===");
        System.out.print("Company Name: ");
        String billCompany = scanner.nextLine();
        System.out.print("Address Line 1: ");
        String billAddress1 = scanner.nextLine();
        System.out.print("Address Line 2: ");
        String billAddress2 = scanner.nextLine();
        System.out.print("GSTIN: ");
        String billGSTIN = scanner.nextLine();
        System.out.print("Contact: ");
        String billContact = scanner.nextLine();
        System.out.print("Email: ");
        String billEmail = scanner.nextLine();

        // Ship To Information
        System.out.println("\n=== SHIP TO INFORMATION ===");
        System.out.print("Company Name: ");
        String shipCompany = scanner.nextLine();
        System.out.print("Address Line 1: ");
        String shipAddress1 = scanner.nextLine();
        System.out.print("Address Line 2: ");
        String shipAddress2 = scanner.nextLine();
        System.out.print("GSTIN: ");
        String shipGSTIN = scanner.nextLine();
        System.out.print("Contact: ");
        String shipContact = scanner.nextLine();
        System.out.print("Email: ");
        String shipEmail = scanner.nextLine();

        // Payment Information
        System.out.println("\n=== PAYMENT INFORMATION ===");
        System.out.print("Payment Date: ");
        String paymentDate = scanner.nextLine();
        System.out.print("Payment Terms: ");
        String paymentTerms = scanner.nextLine();


        System.out.println("\n\n");
        System.out.println("================================================================================");
        System.out.println("                              SALES INVOICE                                     ");
        System.out.println("================================================================================");
        System.out.println();
        System.out.println("Bill To:                                     Ship To:");
        System.out.println();
        System.out.println(billCompany + "                         " + shipCompany);
        System.out.println(billAddress1 + "                          " + shipAddress1);
        System.out.println(billAddress2 + "                   " + shipAddress2);
        System.out.println("GSTIN:" + billGSTIN + "                            GSTIN:" + shipGSTIN);
        System.out.println("Contact: " + billContact + "                      Contact: " + shipContact);
        System.out.println("Email: " + billEmail + "            Email: " + shipEmail);
        System.out.println();
        System.out.println("Payment Date: " + paymentDate + "      Payment Terms: " + paymentTerms);
        System.out.println();
    }
}