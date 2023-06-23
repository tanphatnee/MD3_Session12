package baitaptonghop.model;

public class Product extends RootModel {
    private int id;

    private String prdName;

    private double price;

    private int quantity;

    private Brand brand;

    private Color color;

    private Category category;

    public Product() {
    }

    public Product(String product) {
        super();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", prdName='" + prdName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", brand=" + brand +
                ", color=" + color +
                ", category=" + category +
                '}';
    }

    public Product(int id, String prdName, double price, int quantity, Brand brand, Color color, Category category) {
        this.id = id;
        this.prdName = prdName;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        this.color = color;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
