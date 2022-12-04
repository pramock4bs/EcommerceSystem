package customerManagement.Contracts.Output;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import customerManagement.Contracts.common.Product;

public class AddProductResponse {

    boolean isSuccess;
	public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    String errorReason;
    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    Product product;

    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @JsonCreator
    private AddProductResponse(@JsonProperty("isSuccess") boolean isSuccess, 
    		@JsonProperty("errorReason") String errorReason, 
    		@JsonProperty("product") Product product)
    {
        this.isSuccess = isSuccess;
        this.errorReason = errorReason;
        this.product = product;
    }

    public static AddProductResponse Create(boolean isSuccess, 
    		String errorReason, 
    		Product product)
    {
        return new AddProductResponse(isSuccess, errorReason, product);
    }
}
