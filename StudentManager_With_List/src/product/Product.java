package product;

public class Product implements Comparable<Product> {
    private String name;
    private int price;
    private int id;

    public Product(int id, String name, int price) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public Product(String name, int price) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {

        return String.format(" |ID: %-3d", id) + String.format(" |Name: %-8s", name) + String.format(" |Price: %-8d", price);
    }

    @Override
    public int compareTo(Product o) {
        if (price == o.getPrice())
            return 0;
        else if (price > o.getPrice())
            return 1;
        else
            return -1;
    }
}
