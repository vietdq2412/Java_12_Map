package manager_arraylist;

import product.Product;

import java.util.*;

public class ArrayListManager {
    private int id = 0;
    public List<Product> products = new ArrayList<>();
    private Product Comparator;

    public ArrayListManager() {
    }

    public ArrayListManager(List<Product> products) {
        this.products = products;
    }

    public void addProduct(String name, int price) {
        Product newProduct = new Product(this.id, name, price);
        products.add(newProduct);
        this.id++;
    }

    public void editProduct(int id, String name, int price) {
        for (Product ele : products) {
            if (ele.getId() == id) {
                ele.setName(name);
                ele.setPrice(price);
            }
        }
    }

    public void deleteProduct(int id) {
        products.remove(id);
    }

    public void searchProductByName(String name) {
        int[] index = new int[products.size()];
        int count = 0;

        for (Product e : products) {
            if (e.getName().equals(name)) {
                System.out.println(e.toString());
            }
        }
    }

    public void sortUp() {
        Collections.sort(products);
        showList();
    }

    public void sortDown() {
        Collections.sort(products);
        Collections.reverse(products);
        showList();
    }

    public void showList() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }


}
