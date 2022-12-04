package customerManagement.Contracts.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    public int productId;
    public int quantity;
    
    @JsonCreator
    private Product(@JsonProperty("productId") int productId, 
    		@JsonProperty("quantity") int quantity)
    {
        this.productId = productId;
        this.quantity = quantity;
    }

    public static Product Create(int productId, int quantity)
    {
        return new Product(productId, quantity);
    }
}
