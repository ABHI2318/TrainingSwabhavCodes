package com.aurion.test;

import com.aurion.model.InventoryService;
import java.util.Scanner;

public class InventoryApp {

    public static void main(String[] args) {
        InventoryService service = new InventoryService();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    service.addProduct(scanner);
                    break;
                case 2:
                    service.updateProduct(scanner);
                    break;
                case 3:
                    service.deleteProduct(scanner);
                    break;
                case 4:
                    service.viewProduct(scanner);
                    break;
                case 5:
                    service.viewAllProducts();
                    break;
                case 6:
                    service.addSupplier(scanner);
                    break;
                case 7:
                    service.updateSupplier(scanner);
                    break;
                case 8:
                    service.deleteSupplier(scanner);
                    break;
                case 9:
                    service.viewSupplierDetails(scanner);
                    break;
                case 10:
                    service.viewAllSuppliers();
                    break;
                case 11:
                    service.processTransaction(scanner);
                    break;
                case 12:
                    service.viewTransactionHistory(scanner);
                    break;
                case 13:
                    service.saveData();
                    System.out.println("Data saved successfully.");
                    break;
                case 14:
                    service.generateReport();
                    break;
                case 15:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }

        scanner.close();
        System.out.println("Exiting the program.");
    }

    private static void displayMenu() {
        System.out.println("----Inventory Management System ----");
        System.out.println("1. Add Product");
        System.out.println("2. Update Product");
        System.out.println("3. Delete Product");
        System.out.println("4. View Product");
        System.out.println("5. View All Products");
        System.out.println("6. Add Supplier");
        System.out.println("7. Update Supplier");
        System.out.println("8. Delete Supplier");
        System.out.println("9. View Supplier Details");
        System.out.println("10. View All Suppliers");
        System.out.println("11. Process Transaction");
        System.out.println("12. View Transaction History");
        System.out.println("13. Save Data");
        System.out.println("14. Generate Report");
        System.out.println("15. Exit");
        System.out.print("Enter your choice: ");
    }
}
