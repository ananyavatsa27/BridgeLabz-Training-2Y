interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

  
    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setProductId(String productId) { this.productId = productId; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

  
    public abstract double calculateDiscount();

    public void displayInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}


class Electronics extends Product implements Taxable {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
      
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}


class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
      
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
     
        return getPrice() * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}


class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
      
        return 0.0;
    }

    public class ECommerce {
    public static void main(String[] args) {
        Product phone = new Electronics("E1001", "Smartphone", 1000.00);
        Product shirt = new Clothing("C2001", "T-Shirt", 50.00);
        Product apple = new Groceries("G3001", "Apples", 5.00);

        displayProduct(phone);
        displayProduct(shirt);
        displayProduct(apple);
    }

    public static void displayProduct(Product product) {
        product.displayInfo();
        System.out.println("Discount: $" + product.calculateDiscount());

        if (product instanceof Taxable) {
            Taxable taxable = (Taxable) product;
            System.out.println(taxable.getTaxDetails());
            System.out.println("Tax: $" + taxable.calculateTax());
        } else {
            System.out.println("No tax applicable.");
        }

        System.out.println("-------------------------------");
    
    }
}

}

