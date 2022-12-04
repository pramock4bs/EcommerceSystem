package customerManagement.Contracts.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductId {
    public int productId;

    @JsonCreator
    private ProductId(@JsonProperty("productId") int productId)
    {
        this.productId = productId;
    }

    public static ProductId Create(int productId)
    {
        return new ProductId(productId);
    }
}
