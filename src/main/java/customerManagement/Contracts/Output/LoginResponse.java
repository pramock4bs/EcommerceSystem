package customerManagement.Contracts.Output;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginResponse {

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
    private LoginResponse(@JsonProperty("isSuccess") boolean isSuccess, 
    		@JsonProperty("errorReason") String errorReason)
    {
        this.isSuccess = isSuccess;
        this.errorReason = errorReason;
    }

    public static LoginResponse login(boolean isSuccess, String errorReason)
    {
        return new LoginResponse(isSuccess, errorReason);
    }
}
