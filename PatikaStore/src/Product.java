public class Product {
    private int id;
    private String name;
    private double price;
    private double discountRate;
    private int stock;

    private Brand brand;

    public Product(int id,String name, double price,double discountRate,int stock,Brand brand){
        this.id=id;
        this.name=name;
        this.price=price;
        this.discountRate=discountRate;
        this.stock=stock;
        this.brand=brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString(){
        return String.format("| %-2d | %-30s | %-9.2f TL | %-8s |", id, name, price, brand.getName());
    }
}
