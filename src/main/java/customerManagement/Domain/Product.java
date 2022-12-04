package customerManagement.Domain;

public class Product {
    public ProductId id;
    public int quantity;
    
    private Product(ProductId id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public static Product create(ProductId id, int quantity) {
        return new Product(id, quantity);
    }
}
