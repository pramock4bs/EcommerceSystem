package customerManagement.Contracts.Input;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import customerManagement.Contracts.common.Email;

public class LoginRequest {
    public Email email;
    public String password;

    @JsonCreator
    private LoginRequest(@JsonProperty("email") Email email, @JsonProperty("password") String password)
    {
        this.email = email;
        this.password = password;
    } 
}
