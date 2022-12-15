package customerManagement.Domain.Interfaces;

import java.util.List;

import customerManagement.Contracts.Input.LoginRequest;
import customerManagement.Domain.Customer;
import customerManagement.Domain.Login;

public interface ICustomerRepository {
    int Store(Customer customer);
    Customer Load(int customerId);
    Login Authenticate(LoginRequest loginRequest);
    // List<Customer> Search(String customerName);
}
