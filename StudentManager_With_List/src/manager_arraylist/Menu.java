package manager_arraylist;

import product.Product;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Menu extends ArrayListManager {
    private final String MENU = " ----------Menu----------"
            + "\n| --1.Add product---------|"
            + "\n| --2.Sort product--------|"
            + "\n| --3.Edit product -------|"
            + "\n| --4.Delete product------|"
            + "\n| --5.Search product------|"
            + "\n| --6.Show products list--|"
            + "\n| --7.  exit  ------------|"
            + "\n|_________________________|"
            + "\n| Enter your choice: ";
    private final Scanner sc = new Scanner(System.in);

    ///
    public void run() {
        printMenu();
        int choice = sc.nextInt();
        while (choice != 7) {
            runMenu(choice);
            printMenu();
            choice = sc.nextInt();
        }
    }

    public void printMenu() {
        System.out.println(MENU);
    }

    public void runMenu(int choice) {
        switch (choice) {
            case 1:
                String name = inputName();
                int price = inputPrice();
                addProduct(name, price);
                break;
            case 2:
                System.out.println("|--1. sort up---|" +
                                   "|--2. sort down-|");
                System.out.println("Your choice: ");
                int c = sc.nextInt();
                switch (c) {
                    case 1:
                        sortUp();
                        break;
                    case 2:
                        sortDown();
                        break;
                    default:
                        System.out.println("invalid!");
                }
                break;
            case 3:
                int id = inputID();
                name = inputName();
                price = inputPrice();

                editProduct(id, name, price);
                break;
            case 4:
                id = inputID();
                deleteProduct(id);
                break;
            case 5:
                name = inputName();
                searchProductByName(name);
                break;
            case 6:
                showList();
                break;
            default:
        }
    }

    private int inputPrice() {
        int price;
        System.out.println("enter price: ");
        price = sc.nextInt();
        return price;
    }

    private String inputName() {
        String name;
        System.out.println("enter name: ");
        sc.nextLine();
        name = sc.nextLine();
        return name;
    }

    public int inputID() {
        System.out.println("Enter ID: ");
        int id = sc.nextInt();
        return id;
    }

}
