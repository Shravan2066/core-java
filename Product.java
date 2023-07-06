public class Product {
    static String name;
    static String category;
    static double price;
    static int quantity;
    static String description;
    static String manufacturer;

    boolean available;
    double discountPercentage;
    String color;
    String size;
    String shippingMethod;
    boolean isFeatured;

    public static void main(String[] args) {
        Product phone = new Product("iPhone 12", "Electronics", 999.99, 10, "Smartphone", "Apple");
        System.out.println(phone.name);
        System.out.println(phone.category);

        Product phone2 = new Product("Samsung Galaxy S21", "Electronics", 899.99, 8, "Smartphone", "Samsung");
        System.out.println(phone2.price);
        System.out.println(phone2.quantity);

        Product tv = new Product("Sony Bravia 4K TV", "Electronics", 1499.99, 5, "Television", "Sony");
        System.out.println(tv.name);
        System.out.println(tv.manufacturer);

        Product shoes = new Product("Nike Air Max", "Shoes", 129.99, 20, "Running Shoes", "Nike");
        System.out.println(shoes.category);
        System.out.println(shoes.description);

        Product camera = new Product("Canon EOS Rebel T7i", "Electronics", 799.99, 3, "Digital Camera", "Canon");
        System.out.println(camera.price);
        System.out.println(camera.quantity);
    }

    public Product(String name, String category, double price, int quantity, String description, String manufacturer) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.manufacturer = manufacturer;
    }
}
