package customerManagement.Domain;

public class Email {
    public String email;
    
    private Email(String email) {
        this.email = email;
    }

    public static Email create(String email) {
        return new Email(email);
    }
}
