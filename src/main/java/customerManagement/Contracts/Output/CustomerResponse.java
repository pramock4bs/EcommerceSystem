package customerManagement.Contracts.Output;

import java.util.List;

import customerManagement.Contracts.common.Address;
import customerManagement.Contracts.common.Email;
import customerManagement.Contracts.common.Phone;
import customerManagement.Contracts.common.Product;
import customerManagement.Contracts.common.ProductId;

public class CustomerResponse {
    int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    String phone;

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    Address address;
    // public List<Product> cart;
    // public List<ProductId> wishList;

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    private CustomerResponse(int id, String name, String email, String phone, Address address, List<Product> cart,
    List<ProductId> wishList) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        // this.cart = cart;
        // this.wishList = wishList;
    }

    // public static CustomerResponse create(int id, String name, String email, String phone, Address address, List<Product> cart,
    // List<ProductId> wishList) {
    //     return new CustomerResponse(id, name, email, phone, address, cart, wishList);
    // }

    public static CustomerResponse create(int id, String name, String email, String phone, Address address) {
        return new CustomerResponse(id, name, email, phone, address, null,null);
    }
}
