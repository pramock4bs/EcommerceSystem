package customerManagement.Application.Interfaces;

import customerManagement.Contracts.Input.AddProductRequest;
import customerManagement.Contracts.Output.AddProductResponse;

public interface ICustomerService {

    AddProductResponse addProduct(AddProductRequest addPrdoctRequest);

}
