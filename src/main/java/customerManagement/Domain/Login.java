package customerManagement.Domain;
import customerManagement.Contracts.common.Email;

public class Login {
    public Email email;
    public String password;
    
    private Login(Email email, String password) {
        this.email = email;
        this.password = password;
    }

    public static Login authenticate(Email email, String password) {
        return new Login(email, password);
    }
}
