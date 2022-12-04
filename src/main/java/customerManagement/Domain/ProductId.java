package customerManagement.Domain;

public class ProductId {
    public int id;
    
    private ProductId(int id) {
        this.id = id;
    }

    public static ProductId create(int id) {
        return new ProductId(id);
    }
    
}
