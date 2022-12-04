package customerManagement.Domain;

import java.util.List;

public class Customer {
    public String name;
    public Email email;
    public Phone phone;
    public Address address;
    public List<ProductId> cart;
    public List<ProductId> wishList;

    private Customer(String name,
    Email email,
    Phone phone,
    Address address,
    List<ProductId> cart,
    List<ProductId> wishList) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.cart = cart;
        this.wishList = wishList;
    }

    public static Customer create(String name,
    Email email,
    Phone phone,
    Address address,
    List<ProductId> cart,
    List<ProductId> wishList) {
        return new Customer(name, email, phone, address, cart, wishList);
    }
}
