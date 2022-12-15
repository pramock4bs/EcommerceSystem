package customerManagement.Infrastructure.Repository;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import customerManagement.Contracts.Input.LoginRequest;
import customerManagement.Domain.Address;
import customerManagement.Domain.Customer;
import customerManagement.Domain.Email;
import customerManagement.Domain.Login;
import customerManagement.Domain.Phone;
import customerManagement.Domain.PhoneType;
import customerManagement.Domain.Interfaces.ICustomerRepository;

@Service
public class CustomerRepository implements ICustomerRepository {

    @Override
    public int Store(Customer customer) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Customer Load(int customerId) {
        return Customer.create(1, "Amitabh bachhan", Email.create("a@bachhan@gmail.com"), Phone.create("23234345", PhoneType.MOBILE), Address.create(  "badi pulia ",  "Chote Naale ke paas", "India"), new ArrayList<>(), new ArrayList<>());
    }
    
    @Override
    public Login Authenticate(LoginRequest loginRequest) {
        return Login.authenticate(loginRequest.email, loginRequest.password);
    }
}
