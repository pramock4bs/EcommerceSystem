package customerManagement.Domain;

import java.util.List;

public class Customer {
    public String name;
    public Email email;
    public Phone phone;
    public Address address;
    public List<ProductId> cart;
    public List<ProductId> wishList;
    public int id;

    private Customer(int id, String name,
            Email email,
            Phone phone,
            Address address,
            List<ProductId> cart,
            List<ProductId> wishList) {
                this.id = id
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
        return new Customer(-1, name, email, phone, address, cart, wishList);
    }

    public static Customer create(int id, String name,
            Email email,
            Phone phone,
            Address address,
            List<ProductId> cart,
            List<ProductId> wishList) {
        return new Customer(id, name, email, phone, address, cart, wishList);
    }
}
