package customerManagement.Application;

import org.springframework.stereotype.Service;

import customerManagement.Application.Interfaces.ICustomerService;
import customerManagement.Contracts.Input.AddProductRequest;
import customerManagement.Contracts.Output.AddProductResponse;
import customerManagement.Contracts.Output.CustomerResponse;
import customerManagement.Contracts.common.Address;
import customerManagement.Domain.Customer;
import customerManagement.Domain.Product;
import customerManagement.Domain.ProductId;
import customerManagement.Domain.Interfaces.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService{

    ICustomerRepository repository;

    public CustomerService(ICustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public AddProductResponse addProduct(AddProductRequest addProductRequest) {
        Customer customer = this.repository.Load(addProductRequest.customerId);
        customer.cart.add(Product.create(ProductId.create(addProductRequest.product.productId), addProductRequest.product.quantity));
        this.repository.Store(customer);
        return AddProductResponse.Create(true, null);
    }

    @Override
    public CustomerResponse getCustomerById(int customerId) {
        Customer customer = this.repository.Load(customerId);
        return this.mapToContract(customer);
    }

    private CustomerResponse mapToContract(Customer customer) {
        //return CustomerResponse.create(customer.id, customer.name, customer.email.email, customer.phone.number,  customer.address, customer.cart, customer.wishList);
        return CustomerResponse.create(customer.id, customer.name, customer.email.email, customer.phone.number, Address.create(customer.address.addressLine1, customer.address.addressLine2, customer.address.country));
    }
    
}
