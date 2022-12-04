package customerManagement.Service.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import customerManagement.Application.Interfaces.ICustomerService;
import customerManagement.Contracts.Input.AddProductRequest;
import customerManagement.Contracts.Input.GetProductRequest;
import customerManagement.Contracts.Input.GetProductsHistoryRequest;
import customerManagement.Contracts.Input.LoginRequest;
import customerManagement.Contracts.Input.LogoutRequest;
import customerManagement.Contracts.Input.ReviewProductRequest;
import customerManagement.Contracts.Output.AddProductResponse;
import customerManagement.Contracts.Output.GetProductResponse;
import customerManagement.Contracts.Output.GetProductsHistoryResponse;
import customerManagement.Contracts.Output.LoginResponse;
import customerManagement.Contracts.Output.LogoutResponse;
import customerManagement.Contracts.Output.ReviewProductResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value="customer")
@Api(tags="Customers")
public class CustomerController {

	public ICustomerService _customerService;
	
    public CustomerController(ICustomerService customerService)
    {
        this._customerService = customerService;
    } 

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    @ApiOperation(value = "Get specific Customer in the System ", notes="Returns Test message",
				response = String.class, tags = "Customers")
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Suceess|OK"),
		@ApiResponse(code = 401, message = "not authorized!"), 
		@ApiResponse(code = 403, message = "forbidden!!!"),
		@ApiResponse(code = 404, message = "not found!!!"),
		@ApiResponse(code = 500, message="Internal Server Error")
	})
    public String GetCustomer(@PathVariable(value="id") int customerId) {
        return "Working"+customerId;
    }

	@RequestMapping(value="/login", method = RequestMethod.POST, consumes={"application/json"})
	@ApiOperation(value = "Used to Login in the System ", notes="Returns Login response",
				response = String.class, tags = "Customers")
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Suceess|OK"),
		@ApiResponse(code = 401, message = "not authorized!"), 
		@ApiResponse(code = 403, message = "forbidden!!!"),
		@ApiResponse(code = 404, message = "not found!!!"),
		@ApiResponse(code = 500, message="Internal Server Error")
	})
	public LoginResponse Login(@RequestBody LoginRequest logiRequest) {
		return new LoginResponse();
	}

	@RequestMapping(value="/logout", method = RequestMethod.POST, consumes={"application/json"})
	@ApiOperation(value = "Used to Logout from the System ", notes="Returns Logout response",
				response = String.class, tags = "Customers")
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Suceess|OK"),
		@ApiResponse(code = 401, message = "not authorized!"), 
		@ApiResponse(code = 403, message = "forbidden!!!"),
		@ApiResponse(code = 404, message = "not found!!!"),
		@ApiResponse(code = 500, message="Internal Server Error")
	})
	public LogoutResponse Logout(@RequestBody LogoutRequest logoutRequest) {
		return new LogoutResponse();
	}

	@RequestMapping(value="/products/details", method = RequestMethod.POST, consumes={"application/json"})
	@ApiOperation(value = "Used to See purchased products details from the System ", notes="Returns Product Details",
				response = String.class, tags = "Customers")
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Suceess|OK"),
		@ApiResponse(code = 401, message = "not authorized!"), 
		@ApiResponse(code = 403, message = "forbidden!!!"),
		@ApiResponse(code = 404, message = "not found!!!"),
		@ApiResponse(code = 500, message="Internal Server Error")
	})
	public GetProductResponse GetProductDetails(@RequestBody GetProductRequest logoutRequest) {
		return new GetProductResponse();
	}

	@RequestMapping(value="/products/history", method = RequestMethod.POST, consumes={"application/json"})
	@ApiOperation(value = "Used to see purchased products history from the System ", notes="Returns Purchased item history response",
				response = String.class, tags = "Customers")
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Suceess|OK"),
		@ApiResponse(code = 401, message = "not authorized!"), 
		@ApiResponse(code = 403, message = "forbidden!!!"),
		@ApiResponse(code = 404, message = "not found!!!"),
		@ApiResponse(code = 500, message="Internal Server Error")
	})
	public GetProductsHistoryResponse GetProductsHistory(@RequestBody GetProductsHistoryRequest logoutRequest) {
		return new GetProductsHistoryResponse();
	}

	@RequestMapping(value="/review/product" ,method = RequestMethod.POST, consumes={"application/json"})
	@ApiOperation(value = "Used to Review the product in the System ", notes="Returns review Status response",
				response = String.class, tags = "Customers")
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Suceess|OK"),
		@ApiResponse(code = 401, message = "not authorized!"), 
		@ApiResponse(code = 403, message = "forbidden!!!"),
		@ApiResponse(code = 404, message = "not found!!!"),
		@ApiResponse(code = 500, message="Internal Server Error")
	})
	public ReviewProductResponse ReviewProduct(@RequestBody ReviewProductRequest logoutRequest) {
		return new ReviewProductResponse();
	}


	@RequestMapping(value="/cart/addproduct" ,method = RequestMethod.POST, consumes={"application/json"})
	@ApiOperation(value = "Used to add product to the cart", notes="Returns review Status response",
				response = String.class, tags = "Customers")
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Suceess|OK"),
		@ApiResponse(code = 401, message = "not authorized!"), 
		@ApiResponse(code = 403, message = "forbidden!!!"),
		@ApiResponse(code = 404, message = "not found!!!"),
		@ApiResponse(code = 500, message="Internal Server Error")
	})
	public AddProductResponse AddProduct(@RequestBody AddProductRequest addPrdoctRequest) {
		AddProductResponse addProductResponse = _customerService.addProduct(addPrdoctRequest);
		return addProductResponse;
	}

	// login/signup
	// getProductUpdates (Tracking)
	// getProductHistory
	// reviewProduct
	// paymentsDelails - get/update
	// customer details - update

    
}
