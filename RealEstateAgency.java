import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// RealEstateAgency class → data pool + operations
public class RealEstateAgency {

    private String name;
    private List<Property> properties;
    private List<Agent> agents;

    public RealEstateAgency(String name) {
        this.name = name;
        this.properties = new ArrayList<>();
        this.agents = new ArrayList<>();
    }

    // Add property / agent
    public void addProperty(Property property) {
        properties.add(property);
    }

    public void addAgent(Agent agent) {
        agents.add(agent);
    }

    // Search property by ID
    public Property findPropertyById(int id) {
        for (Property p : properties) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    // Filter properties by max price
    public List<Property> filterPropertiesByPrice(double maxPrice) {
        List<Property> result = new ArrayList<>();
        for (Property p : properties) {
            if (p.getPrice() <= maxPrice) {
                result.add(p);
            }
        }
        return result;
    }

    // Sort properties by price ascending
    public void sortPropertiesByPrice() {
        properties.sort(Comparator.comparingDouble(Property::getPrice));
    }

    // Display
    public void displayProperties() {
        for (Property p : properties) {
            System.out.println(p);
        }
    }

    public void displayAgents() {
        for (Agent a : agents) {
            System.out.println(a);
        }
    }

    public List<Property> getProperties() {
        return new ArrayList<>(properties);
    }
}
