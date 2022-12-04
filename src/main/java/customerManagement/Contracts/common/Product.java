package customerManagement.Contracts.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    public int productId;
    public int customerId;
    public int quantity;
    
    @JsonCreator
    private Product(@JsonProperty("productId") int productId, 
    		@JsonProperty("quantity") int quantity, 
    		@JsonProperty("customerId") int customerId)
    {
        this.productId = productId;
        this.quantity = quantity;
        this.customerId = customerId;        
    }

    public static Product Create(int productId, int quantity, int customerId)
    {
        return new Product(productId, quantity, customerId);
    }
}
