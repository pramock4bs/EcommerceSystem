package customerManagement.Contracts.Output;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    @JsonCreator
    private AddProductResponse(@JsonProperty("isSuccess") boolean isSuccess, 
    		@JsonProperty("errorReason") String errorReason)
    {
        this.isSuccess = isSuccess;
        this.errorReason = errorReason;
    }

    public static AddProductResponse Create(boolean isSuccess, String errorReason)
    {
        return new AddProductResponse(isSuccess, errorReason);
    }
}
