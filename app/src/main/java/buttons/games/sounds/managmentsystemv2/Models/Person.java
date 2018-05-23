package buttons.games.sounds.managmentsystemv2.Models;

import java.util.List;

public class Person {

    private int id;
    private String name, surname, rentFrom, rentTill, phoneNumber, email, address, note;
    private double subTotal;
    private List<Device> rentedDevices;

    public Person(String name, String surname, String rentFrom,
                  String rentTill, String phoneNumber, String email,
                  String address, String note, double subTotal, List<Device> rentedDevices) {
        this.name = name;
        this.surname = surname;
        this.rentFrom = rentFrom;
        this.rentTill = rentTill;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.note = note;
        this.subTotal = subTotal;
        this.rentedDevices = rentedDevices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRentFrom() {
        return rentFrom;
    }

    public void setRentFrom(String rentFrom) {
        this.rentFrom = rentFrom;
    }

    public String getRentTill() {
        return rentTill;
    }

    public void setRentTill(String rentTill) {
        this.rentTill = rentTill;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddres(String address) {
        this.address = address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public List<Device> getRentedDevices() {
        return rentedDevices;
    }

    public void setRentedDevices(List<Device> rentedDevices) {
        this.rentedDevices = rentedDevices;
    }
}
