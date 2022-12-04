


package customerManagement.Contracts.Input;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import customerManagement.Contracts.common.Product;

public class AddProductRequest
{
    public Product product;
    public int customerId;
    @JsonCreator
    private AddProductRequest(@JsonProperty("product") Product product, @JsonProperty("customerId") int customerId)
    {
        this.product = product;
        this.customerId = customerId;
    } 

    public static AddProductRequest Create(Product product, int customerId)
    {
        return new AddProductRequest(product, customerId);
    }
}

 