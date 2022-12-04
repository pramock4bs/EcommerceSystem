package customerManagement.Application.Interfaces;

import customerManagement.Contracts.Input.AddProductRequest;
import customerManagement.Contracts.Output.AddProductResponse;
import customerManagement.Contracts.Output.CustomerResponse;

public interface ICustomerService {

    AddProductResponse addProduct(AddProductRequest addPrdoctRequest);

    CustomerResponse getCustomerById(int customerId);

}
