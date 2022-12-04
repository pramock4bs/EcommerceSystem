package customerManagement.Domain;

public class Phone {
    public int id;
    public PhoneType phoneType;
    
    private Phone(int id, PhoneType phoneType) {
        this.id = id;
        this.phoneType = phoneType;
    }

    public static Phone create(int id, PhoneType phoneType) {
        return new Phone(id, phoneType);
    }
}