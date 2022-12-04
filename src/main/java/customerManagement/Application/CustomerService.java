package customerManagement.Application;

import org.springframework.stereotype.Service;

import customerManagement.Application.Interfaces.ICustomerService;
import customerManagement.Contracts.Input.AddProductRequest;
import customerManagement.Contracts.Output.AddProductResponse;

@Service
public class CustomerService implements ICustomerService{

    @Override
    public AddProductResponse addProduct(AddProductRequest addPrdoctRequest) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
