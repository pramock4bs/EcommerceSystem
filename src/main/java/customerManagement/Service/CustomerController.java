package customerManagement.Service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value="customer")
@Api(tags="Customers")
public class CustomerController {

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    @ApiOperation(value = "Get specific Customer in the System ", notes="Returns a particular",
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
    
}
