package customerManagement.Domain.Interfaces;

import java.util.List;

import customerManagement.Domain.Customer;

public interface ICustomerRepository {
    int Store(Customer customer);
    Customer Load(int customerId);
    // List<Customer> Search(String customerName);
}
