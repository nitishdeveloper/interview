package com.java.other;


class Address implements Cloneable {
    private String street;
    private String city;
    private String country;

    public Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}


class User implements Cloneable {

    private String firstName;
    private String lastName;
    private Address address;

    public User(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        user.address = (Address) this.address.clone();
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }
}

class Demo12 {
    private String firstName;
    private String lastName;
    private Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}

public class CloningApplication {
    public static void main(String[] args) {
        System.out.println("Origin Object");
        Address address = new Address("chauhan colony", "faridabad", "india");
        User user = new User("nitsh", "prajapati", address);
        System.out.println(user);

        User user1 = null;
        try {
            user1 = (User) user.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        user1.getAddress().setStreet("chauhan");
        user1.getAddress().setCity("fbd");

        System.out.println("After Cloning Original Object");
        System.out.println("user" + user);


        System.out.println("After Cloning Object");
        System.out.println("user1 :" + user1);

        Demo12 demo12 = new Demo12();

    }
}

