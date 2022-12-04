package customerManagement.Contracts.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Address
{
    public String addressLine1; 
	public String addressLine2;
    public String country;
    
	@JsonCreator
    private Address(@JsonProperty("addressLine1") String addressLine1, 
    		@JsonProperty("addressLine2") String addressLine2, @JsonProperty("country") String country)
    {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.country = country;
    }
    public static Address create(String addressLine1, String addressLine2, String country)
    {
        return new Address(addressLine1, addressLine2, country);
    }

}
