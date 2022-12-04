


package customerManagement.Contracts.Input;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import customerManagement.Contracts.common.Product;

public class AddProductRequest
{
    public Product product;
    @JsonCreator
    private AddProductRequest(@JsonProperty("product") Product product)
    {
        this.product = product;
    } 

    public static AddProductRequest Create(Product product)
    {
        return new AddProductRequest(product);
    }
}

 