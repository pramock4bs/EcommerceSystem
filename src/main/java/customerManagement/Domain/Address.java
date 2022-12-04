package customerManagement.Domain;

public class Address {
    public String addressLine1;
    public String addressLine2;
    public String country;

    private Address(String addressLine1, String addressLine2, String country) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.country = country;
    }

    public static Address create(String addressLine1, String addressLine2, String country) {
        return new Address(addressLine1, addressLine2, country);
    }
}
