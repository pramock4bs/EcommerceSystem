package customerManagement.Contracts.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Phone {
    
    public String phone;
    
	@JsonCreator
    private Phone(@JsonProperty("email") String phone)
    {
        this.phone = phone;
    }
    public static Phone create(String phone)
    {
        return new Phone(phone);
    }
}
