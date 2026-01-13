import java.util.Objects;

// Property class with encapsulation, abstraction
public class Property {

    private int id;
    private String address;
    private double price;
    private String type; // e.g., "House", "Apartment" → for polymorphism

    public Property(int id, String address, double price, String type) {
        this.id = id;
        this.address = address;
        this.price = price;
        this.type = type;
    }

    // Getters & setters → encapsulation
    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null && !address.isEmpty()) {
            this.address = address;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public String getType() {
        return type;
    }

    // Polymorphic behavior (description)
    public String getDescription() {
        return type + " at " + address;
    }

    @Override
    public String toString() {
        return String.format("%s[ID=%d, Address=%s, Price=%.2f]", type, id, address, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Property)) return false;
        Property property = (Property) o;
        return id == property.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
