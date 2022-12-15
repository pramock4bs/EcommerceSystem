package customerManagement.Contracts.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Email {
    
    public String email;
    
	@JsonCreator
    private Email(@JsonProperty("email") String email)
    {
        this.email = email;
    }
    public static Email create(String email)
    {
        return new Email(email);
    }

}
