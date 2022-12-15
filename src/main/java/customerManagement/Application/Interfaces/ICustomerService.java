package customerManagement.Application.Interfaces;

import customerManagement.Contracts.Input.AddProductRequest;
import customerManagement.Contracts.Input.LoginRequest;
import customerManagement.Contracts.Output.AddProductResponse;
import customerManagement.Contracts.Output.CustomerResponse;
import customerManagement.Contracts.Output.LoginResponse;

public interface ICustomerService {

    AddProductResponse addProduct(AddProductRequest addPrdoctRequest);

    CustomerResponse getCustomerById(int customerId);

    LoginResponse login(LoginRequest loginRequest);

}
