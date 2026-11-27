import java.util.Scanner;
public class E_CommerceProductPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int productType = sc.nextInt();
        int productId = sc.nextInt();
        String productName = sc.next();
        double price = sc.nextDouble();

        Product product = null;

        if (productType == 1) {
            product = new ElectronicsProduct(productId, productName, price);
        } else if (productType == 2) {
            product = new ClothingProduct(productId, productName, price);
        } else if (productType == 3) {
            product = new GroceryProduct(productId, productName, price);
        }

        if (product != null) {
            double discount = product.calculateDiscount();
            double finalPrice = product.price - discount;

            System.out.println("Product ID: " + product.productId);
            System.out.println("Product Name: " + product.productName);
            System.out.printf("Discount: %.2f%n", discount);
            System.out.printf("Final Price: %.2f%n", finalPrice);
        }

        sc.close();
    }
}

class Product {
    int productId;
    String productName;
    double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public double calculateDiscount() {
        return 0.0;
    }
}

class ElectronicsProduct extends Product {
    public ElectronicsProduct(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.12;
    }
}

class ClothingProduct extends Product {
    public ClothingProduct(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20;
    }
}

class GroceryProduct extends Product {
    public GroceryProduct(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05;
    }
}

