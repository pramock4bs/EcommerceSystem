package customerManagement.Domain;

public class Phone {
    public String number;
    public PhoneType phoneType;
    
    private Phone(String number, PhoneType phoneType) {
        this.number = number;
        this.phoneType = phoneType;
    }

    public static Phone create(String number, PhoneType phoneType) {
        return new Phone(number, phoneType);
    }
}