public class Main {
    public static void main(String[] args) {

        // Create agents
        Agent a1 = new Agent(1, "Aruzhan", "+7 701 123 45 67");
        Agent a2 = new Agent(2, "Dias", "+7 777 987 65 43");

        // Create properties (polymorphic via type field)
        Property p1 = new Property(101, "Astana Left Bank", 120000, "House");
        Property p2 = new Property(102, "Astana Right Bank", 95000, "Apartment");
        Property p3 = new Property(103, "City Center", 150000, "House");

        // Create agency
        RealEstateAgency agency = new RealEstateAgency("Dream House");

        // Add agents and properties
        agency.addAgent(a1);
        agency.addAgent(a2);

        agency.addProperty(p1);
        agency.addProperty(p2);
        agency.addProperty(p3);

        // Display
        System.out.println("=== AGENTS ===");
        agency.displayAgents();

        System.out.println("\n=== ALL PROPERTIES ===");
        agency.displayProperties();

        // Sorting
        System.out.println("\n=== SORTED BY PRICE ===");
        agency.sortPropertiesByPrice();
        agency.displayProperties();

        // Filtering
        System.out.println("\n=== FILTER: PRICE <= 120000 ===");
        for (Property p : agency.filterPropertiesByPrice(120000)) {
            System.out.println(p);
        }

        // Searching
        System.out.println("\n=== SEARCH PROPERTY ID 102 ===");
        System.out.println(agency.findPropertyById(102));

        // Comparison
        System.out.println("\n=== OBJECT COMPARISON ===");
        Property test = new Property(102, "Another Address", 99999, "Apartment");
        System.out.println("p2 equals test? " + p2.equals(test));
    }
}
